package example.customView;

import java.lang.System;

/**
 * Created by xiajun on 2017/8/1.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0015J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0014\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lexample/customView/SuspendWindowActivity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "bd", "Lcom/style/framework/databinding/ActivitySuspendWindowBinding;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "arg0", "Landroid/os/Bundle;", "openService", "cls", "Ljava/lang/Class;", "requestDrawOverLays", "Companion", "app__sharp_R3_9_0_0_Debug"})
public final class SuspendWindowActivity extends com.style.base.BaseTitleBarActivity {
    private com.style.framework.databinding.ActivitySuspendWindowBinding bd;
    @org.jetbrains.annotations.NotNull
    public static final example.customView.SuspendWindowActivity.Companion Companion = null;
    public static final int OVERLAY_PERMISSION_REQ_CODE = 1234;
    
    public SuspendWindowActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    private final void openService(java.lang.Class<?> cls) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void requestDrawOverLays() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lexample/customView/SuspendWindowActivity$Companion;", "", "()V", "OVERLAY_PERMISSION_REQ_CODE", "", "app__sharp_R3_9_0_0_Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}