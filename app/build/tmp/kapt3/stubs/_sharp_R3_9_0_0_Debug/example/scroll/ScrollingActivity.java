package example.scroll;

import java.lang.System;

/**
 * app:layout_scrollFlags，设置为：scroll|enterAlways|snap 便是指定标题栏随屏幕滚动实现的属性。
 * scroll表示屏幕向上滑动时，标题栏同时向上滑动并隐藏；
 * enterAlways表示屏幕向下滑动时，标题栏同时向下活动并显示；
 * snap表示Toolbar没有完全显示或隐藏时，根据滚动距离，自动选择。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lexample/scroll/ScrollingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bd", "Lcom/style/framework/databinding/ActivityScrollingBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app__sharp_R3_9_0_0_Debug"})
public final class ScrollingActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.style.framework.databinding.ActivityScrollingBinding bd;
    
    public ScrollingActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}