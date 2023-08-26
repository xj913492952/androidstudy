package example.queue;

import java.lang.System;

/**
 * 接收事件任务
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lexample/queue/ReceiveEventTask;", "Ljava/lang/Runnable;", "code", "", "data", "", "subscriberMap", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "mUIHandler", "Landroid/os/Handler;", "(ILjava/lang/Object;Ljava/util/HashMap;Landroid/os/Handler;)V", "dispatchEvent", "", "subscriber", "eventCode", "run", "app__sharp_R3_9_0_0_Debug"})
public final class ReceiveEventTask implements java.lang.Runnable {
    private int code;
    private java.lang.Object data;
    private java.util.HashMap<java.lang.Object, java.util.HashSet<java.lang.Integer>> subscriberMap;
    private android.os.Handler mUIHandler;
    
    public ReceiveEventTask(int code, @org.jetbrains.annotations.NotNull
    java.lang.Object data, @org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.Object, java.util.HashSet<java.lang.Integer>> subscriberMap, @org.jetbrains.annotations.NotNull
    android.os.Handler mUIHandler) {
        super();
    }
    
    @java.lang.Override
    public void run() {
    }
    
    /**
     * 分发事件
     */
    private final void dispatchEvent(java.lang.Object subscriber, int eventCode, java.lang.Object data) {
    }
}