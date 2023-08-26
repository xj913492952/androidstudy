package example.subThreadLooper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u0004\u0018\u00010\bJ\b\u0010\u001c\u001a\u00020\u0006H\u0007J\b\u0010\u001d\u001a\u00020\u0017H\u0004J\b\u0010\u001e\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lexample/subThreadLooper/MyHandlerThread;", "Ljava/lang/Thread;", "()V", "lock", "Ljava/lang/Object;", "mHandler", "Landroid/os/Handler;", "mLooper", "Landroid/os/Looper;", "getMLooper$app__sharp_R3_9_0_0_Debug", "()Landroid/os/Looper;", "setMLooper$app__sharp_R3_9_0_0_Debug", "(Landroid/os/Looper;)V", "mPriority", "", "getMPriority$app__sharp_R3_9_0_0_Debug", "()I", "setMPriority$app__sharp_R3_9_0_0_Debug", "(I)V", "mTid", "getMTid$app__sharp_R3_9_0_0_Debug", "setMTid$app__sharp_R3_9_0_0_Debug", "HandlerThread", "", "name", "", "priority", "getLooper", "getThreadHandler", "onLooperPrepared", "run", "app__sharp_R3_9_0_0_Debug"})
public final class MyHandlerThread extends java.lang.Thread {
    private final java.lang.Object lock = null;
    private int mPriority = 0;
    private int mTid = -1;
    @org.jetbrains.annotations.Nullable
    private android.os.Looper mLooper;
    @androidx.annotation.Nullable
    private android.os.Handler mHandler;
    
    public MyHandlerThread() {
        super();
    }
    
    public final int getMPriority$app__sharp_R3_9_0_0_Debug() {
        return 0;
    }
    
    public final void setMPriority$app__sharp_R3_9_0_0_Debug(int p0) {
    }
    
    public final int getMTid$app__sharp_R3_9_0_0_Debug() {
        return 0;
    }
    
    public final void setMTid$app__sharp_R3_9_0_0_Debug(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.os.Looper getMLooper$app__sharp_R3_9_0_0_Debug() {
        return null;
    }
    
    public final void setMLooper$app__sharp_R3_9_0_0_Debug(@org.jetbrains.annotations.Nullable
    android.os.Looper p0) {
    }
    
    public final void HandlerThread(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    /**
     * Constructs a HandlerThread.
     * @param name
     * @param priority The priority to run the thread at. The value supplied must be from
     * [android.os.Process] and not from java.lang.Thread.
     */
    public final void HandlerThread(@org.jetbrains.annotations.NotNull
    java.lang.String name, int priority) {
    }
    
    /**
     * Call back method that can be explicitly overridden if needed to execute some
     * setup before Looper loops.
     */
    protected final void onLooperPrepared() {
    }
    
    @java.lang.Override
    public void run() {
    }
    
    /**
     * This method returns the Looper associated with this thread. If this thread not been started
     * or for any reason isAlive() returns false, this method will return null. If this thread
     * has been started, this method will block until the looper has been initialized.
     * @return The looper.
     */
    @org.jetbrains.annotations.Nullable
    public final android.os.Looper getLooper() {
        return null;
    }
    
    /**
     * @return a shared [Handler] associated with this thread
     * @hide
     */
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    public final android.os.Handler getThreadHandler() {
        return null;
    }
}