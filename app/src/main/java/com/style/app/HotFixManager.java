package com.style.app;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.style.utils.AppInfoUtil;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;


public class HotFixManager {
    protected final String TAG = getClass().getSimpleName();

    protected Context context;
    private static HotFixManager mInstance;

    static {
        mInstance = new HotFixManager();
    }

    private SophixManager sophix;

    public synchronized static HotFixManager getInstance() {
        return mInstance;
    }

    public void init(Context context) {
        this.context = context;
        String rsaSecret = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC7d1IQLzGZaRGbPvuUDNfCWj/9OIUc5QuowMU8gq9zsf07rgL30bYJmjc15+Jvvu2sPI9o+WzYXzUj8I/N8kek61N/Lvn505+iDQxd1C/F65g+6xci3/aTXwNiOFuzMu1Sg4sFM5/Caln1UthwDedKue9BSy55zi73IEhWm5Xr4YRYPupCP2bTTOl7tOiOf5Mc+qG22hxbDZMxgcobCYGu341HkGnRP13BzD1CpxNmplJanxqCdkrtSd36+5qWJDfx7QTDfZprcDGlMuBKfyQyjXj47lG3uNFR3MtrNdyxY/4Paza06qyQyRxh4UozvmLc1lU8N82Texx2m3VAiesXAgMBAAECggEBAIIgEgt/5srZHsqHTnP28jFLGg24FNX4uz4ZCQ+2mvkQ/HlXkWHZ5KUHsfkuC4SLoEilBNrV/9K1S5q12ewXl9mHK78lqYjbd3wx2Hqs1bhpj5Vk8/tWQL8M/blI64YY/JkBDBfBPMzjq6vZJLmrPPgm1keZWxpbn0gU1YGgn9FJ1pIC7BoUekwGZszmtLH7E00p0hG9budVuas5+UXJHSiCbphJrNOMYzvLLxrYJCTdYdVZCr0o/sWvB/+2I9rsa1y9DOLelrrogv/noD+sP+qrEmNsF8S33V0iRZbpQ6918k1Y3mV13QIUyhnapZuVy23K5rBuOVHMKrlsH/8K+9ECgYEA/UBYR0TiFfbGloQ7kwrhcSy+05bYMUXfjAht+c8WhVqPMqhtrnMIjY7wxAexwMgaFRnUS4777kBACcnED8pcRMJi+llrAlDsKFbJ+4kloypyU+9JW8SCc+tu5I9+TJhtnHZps3MHiCOf7f8SKP8D/cKyVfADJnef8k2BYm6h9B8CgYEAvYAxPsliwtrGuGxGdUzI5l7ASrKSkykB7OLQijUqu1tEIWiWQJeF8r6qDEPe78ijcW7DjGeosBgOsszZlo0t6asx/sEwZ7uHLsE/EEg+SUOD9kDrpBI4zRPdaAfTe61JxUrmq8pRj+xIA18YrDhwoqhrIyGzplCyCq1U7dXM6gkCgYBayWRcOD9sbEkI0GKi9fWXotjN9XePQmM/Sg5SzYBfUfWfzW10alyYkrORMsjwOUvQYLAQXjPGV1YdrC0TFBI7vAvLf56y99uRInvKJoJNmfveRxvfP/UcJTxdx2sZflNdEb4WzJfYoBzHLveNps4BfHh+Akq+0YePT2WgqdR5NQKBgHxtZ+hqI0b+j+0Ya0sqF9/r5yclCclG69S3OWcGcgCDdMDbA4118KXrO4zCI+gePfOFXzEZ/1Fg+oW8rEKGgNclabZ082upXqH8kYQHa55/jm5rQk6BCHrfyEk+mkZjCkVZYQz704JFCyPrlS+//3VOUMrInkVeRwlrtpBUCjDBAoGBAK+HMwPXd+tAqGlomZ/7sSX3KjNzo4OCNsQ4Uj1m+XqotCxkb8vvQZ5OIwfUXjv4QB4EXh0qoQsW6/xU1KPQ91iDezPNyNR+A70C6RxBPRVK6fdDdHAxs8smN7uFobOnTuPtl70nwllZmxC5UxnuEm9G/Ot2io7qBYbIK0t1LX+M";
        sophix = SophixManager.getInstance();
        sophix.setContext((Application) this.context)
                .setAppVersion(AppInfoUtil.getVersionName(this.context))
                .setAesKey(null)
                .setEnableDebug(true)
                .setSecretMetaData(null, null, rsaSecret)
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onLoad(final int mode, final int code, final String info, final int handlePatchVersion) {
                        Log.e(TAG, "" + code);
                        // 补丁加载回调通知
                        if (code == PatchStatus.CODE_LOAD_SUCCESS) {
                            // 表明补丁加载成功
                        } else if (code == PatchStatus.CODE_LOAD_RELAUNCH) {
                            // 表明新补丁生效需要重启. 开发者可提示用户或者强制重启;
                            // 建议: 用户可以监听进入后台事件, 然后调用killProcessSafely自杀，以此加快应用补丁，详见1.3.2.3
                            sophix.killProcessSafely();
                        } else {
                            // 其它错误信息, 查看PatchStatus类说明
                        }
                    }
                }).initialize();
    }

    public void query() {
        // queryAndLoadNewPatch不可放在attachBaseContext 中，否则无网络权限，建议放在后面任意时刻，如onCreate中
        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
