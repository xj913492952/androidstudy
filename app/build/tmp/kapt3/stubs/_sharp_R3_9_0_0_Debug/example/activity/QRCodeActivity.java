package example.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0014J-\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lexample/activity/QRCodeActivity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "bd", "Lcom/style/framework/databinding/ActivityQrCodeScanBinding;", "url", "", "getUrl", "()Ljava/lang/String;", "checkCameraPermission", "", "init", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "arg0", "Landroid/os/Bundle;", "onNewIntent", "intent", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "app__sharp_R3_9_0_0_Debug"})
public final class QRCodeActivity extends com.style.base.BaseTitleBarActivity {
    private com.style.framework.databinding.ActivityQrCodeScanBinding bd;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String url = "https://github.com/xj913492952";
    @org.jetbrains.annotations.NotNull
    public static final example.activity.QRCodeActivity.Companion Companion = null;
    private static final int REQ_CAMERA_PERMISSION = 2;
    private static final int REQ_QRCODE = 17;
    
    public QRCodeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void init() {
    }
    
    private final void checkCameraPermission() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lexample/activity/QRCodeActivity$Companion;", "", "()V", "REQ_CAMERA_PERMISSION", "", "REQ_QRCODE", "app__sharp_R3_9_0_0_Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}