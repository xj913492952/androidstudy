package com.style.data.fileDown.multiBlock;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 多线程同时下载一个文件：慎用，这个会让数据库存储变得复杂，还不一定会真正提高下载速度。
 * Created by xiajun on 2017/2/12.
 */
public class MultiThreadDownloadFileTask extends Thread {
    private static final String TAG = MultiThreadDownloadFileTask.class.getSimpleName();

    private static final int DOWN_START = 2;
    private static final int DOWN_PROGRESS = 3;
    private static final int DOWN_COMPLETE = 4;

    private Object tag;//界面标志
    private FileCallback fileDownCallback;
    private boolean canCallback = true;//是否需要执行回调,默认true

    private String downloadUrl;// 下载链接地址
    private int threadNum;// 开启的线程数
    private String filePath;// 保存文件路径地址
    private int fileSize;//文件总大小

    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case DOWN_START:
                    if (isCallbackEnable()) {
                        Bundle bundle = msg.getData();
                        fileDownCallback.start(bundle.getInt("fileSize"));
                    }
                    break;
                case DOWN_PROGRESS:
                    if (isCallbackEnable()) {
                        Bundle bundle = msg.getData();
                        int currentDownSize = bundle.getInt("currentDownSize");
                        int fileSize = bundle.getInt("fileSize");
                        float progress = bundle.getFloat("progress");
                        fileDownCallback.inProgress(currentDownSize, fileSize, progress);
                    }
                    break;
                case DOWN_COMPLETE:
                    if (isCallbackEnable()) {
                        Bundle bundle = msg.getData();
                        fileDownCallback.complete(bundle.getString("filePath"));
                    }
                    break;
            }
        }
    };

    public MultiThreadDownloadFileTask(Object tag, String downloadUrl, int threadNum, String filePath, FileCallback fileDownCallback) {
        this.tag = tag;
        this.downloadUrl = downloadUrl;
        this.threadNum = threadNum;
        this.filePath = filePath;
        this.fileDownCallback = fileDownCallback;
    }

    @Override
    public void run() {
        Message msg = mHandler.obtainMessage(DOWN_START);
        msg.getData().putInt("fileSize", fileSize);
        mHandler.sendMessage(msg);

        PartFileDownloadRangeThread[] threads = new PartFileDownloadRangeThread[threadNum];
        try {
            URL url = new URL(downloadUrl);
            Log.e(TAG, "download file http path:" + downloadUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");//默认浏览器编码类型
            //conn.addRequestProperty("Connection","Keep-Alive");//设置与服务器保持连接
            int code = conn.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                // 读取下载文件总大小
                fileSize = conn.getContentLength();
                if (fileSize <= 0) {
                    Log.e(TAG, "读取文件失败");
                    return;
                }
                // 计算每条线程下载的数据长度
                // 每一个线程的下载量
                int blockSize = (fileSize % threadNum) == 0 ? fileSize / threadNum : fileSize / threadNum + 1;
                Log.d(TAG, "fileSize:" + fileSize + "  blockSize:" + blockSize);
                //目标文件
                File file = new File(filePath);
                if (!file.getParentFile().exists())
                    file.getParentFile().mkdirs();
                for (int i = 0; i < threads.length; i++) {
                    // 启动线程，分别下载每个线程需要下载的部分
                    int startPos = blockSize * (i);//开始位置
                    int endPos = blockSize * (i + 1) - 1;//结束位置
                    threads[i] = new PartFileDownloadRangeThread(url, file, startPos, endPos);
                    threads[i].setName("Thread:" + i);
                    threads[i].start();
                }

                boolean isFinished = false;
                // 当前所有线程下载总量
                int downloadedAllSize = 0;
                while (!isFinished) {
                    isFinished = true;
                    downloadedAllSize = 0;
                    for (int i = 0; i < threads.length; i++) {
                        downloadedAllSize += threads[i].getDownloadLength();
                        if (!threads[i].isCompleted()) {
                            isFinished = false;
                        }
                    }
                    // 通知handler去更新视图组件
                    Message msg2 = mHandler.obtainMessage(DOWN_PROGRESS);
                    msg2.getData().putInt("currentDownSize", downloadedAllSize);
                    msg2.getData().putInt("fileSize", fileSize);
                    msg2.getData().putFloat("progress", downloadedAllSize * 1.0f / fileSize);
                    mHandler.sendMessage(msg2);
                    Log.e(TAG, "current downloadSize:" + downloadedAllSize);
                    try {
                        Thread.sleep(1000);// 休息1秒后再读取下载进度
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Log.e(TAG, " all of downloadSize:" + downloadedAllSize);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCanCallback(boolean canCallback) {
        this.canCallback = canCallback;
    }

    public boolean isCallbackEnable() {
        if (this.canCallback && this.fileDownCallback != null)
            return true;
        return false;
    }

    public void setCallback(FileCallback callback) {
        this.fileDownCallback = callback;
    }
}