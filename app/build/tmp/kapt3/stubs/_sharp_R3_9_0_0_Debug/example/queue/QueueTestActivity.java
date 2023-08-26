package example.queue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lexample/queue/QueueTestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lexample/queue/EventReceiver;", "()V", "bd", "Lcom/style/framework/databinding/ActivityQueueTestBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMainThreadEvent", "code", "", "data", "", "app__sharp_R3_9_0_0_Debug"})
public final class QueueTestActivity extends androidx.appcompat.app.AppCompatActivity implements example.queue.EventReceiver {
    private com.style.framework.databinding.ActivityQueueTestBinding bd;
    
    public QueueTestActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onMainThreadEvent(int code, @org.jetbrains.annotations.NotNull
    java.lang.Object data) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}