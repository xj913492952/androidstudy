package example.subThreadLooper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lexample/subThreadLooper/MsgToSubActivity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "bd", "Lcom/style/framework/databinding/ActivityMsgToSubBinding;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "subThread", "Lexample/subThreadLooper/MyHandlerThread;", "initThreadHandler", "", "onCreate", "arg0", "Landroid/os/Bundle;", "onDestroy", "send", "app__sharp_R3_9_0_0_Debug"})
public final class MsgToSubActivity extends com.style.base.BaseTitleBarActivity {
    private com.style.framework.databinding.ActivityMsgToSubBinding bd;
    public android.os.Handler mHandler;
    private example.subThreadLooper.MyHandlerThread subThread;
    
    public MsgToSubActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getMHandler() {
        return null;
    }
    
    public final void setMHandler(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    private final void initThreadHandler() {
    }
    
    private final void send() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}