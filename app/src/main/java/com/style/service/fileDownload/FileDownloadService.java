package com.style.service.fileDownload;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import android.text.TextUtils;

import java.util.List;

import com.style.data.fileDown.entity.CustomFileBean;

import static com.style.data.fileDown.CustomFileDownloadManager.FLAG_BATCH_DOWNLOAD;
import static com.style.data.fileDown.CustomFileDownloadManager.FLAG_CONTINUE_DOWNLOAD;
import static com.style.data.fileDown.CustomFileDownloadManager.FLAG_NEW_DOWNLOAD;
import static com.style.data.fileDown.CustomFileDownloadManager.FLAG_PAUSE_DOWNLOAD;

public class FileDownloadService extends Service {

    private FileDownloadServiceModel mServiceModel;

    @Override
    public void onCreate() {
        super.onCreate();
        mServiceModel = new FileDownloadServiceModel(getApplication());
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * @param intent  his may be null if the service is being restarted after
     *                its process has gone away, and it had previously returned anything
     *                except {@link #START_STICKY_COMPATIBILITY}.
     * @param flags   Additional data about this start request
     * @param startId
     * @return
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            switch (intent.getAction()) {
                case FLAG_NEW_DOWNLOAD:
                    CustomFileBean f = (CustomFileBean) intent.getSerializableExtra("fileBean");
                    mServiceModel.newDownloadFile(f);
                    break;
                case FLAG_PAUSE_DOWNLOAD:
                    CustomFileBean f2 = (CustomFileBean) intent.getSerializableExtra("fileBean");
                    mServiceModel.pauseDownloadFile(f2);
                    break;
                case FLAG_CONTINUE_DOWNLOAD:
                    CustomFileBean f3 = (CustomFileBean) intent.getSerializableExtra("fileBean");
                    mServiceModel.continueDownloadFile(f3);
                    break;
                case FLAG_BATCH_DOWNLOAD:
                    List<CustomFileBean> fList = (List<CustomFileBean>) intent.getSerializableExtra("fileBeanList");
                    mServiceModel.batchDownloadFile(fList);
                    break;
            }
        }
        return START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {
        mServiceModel.shutdown();
        super.onDestroy();
    }

}
