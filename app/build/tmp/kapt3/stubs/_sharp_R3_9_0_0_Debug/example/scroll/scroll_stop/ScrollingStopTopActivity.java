package example.scroll.scroll_stop;

import java.lang.System;

/**
 * app:layout_scrollFlags，设置为：scroll|enterAlways|snap 便是指定标题栏随屏幕滚动实现的属性。
 * scroll表示屏幕向上滑动时，标题栏同时向上滑动并隐藏；
 * enterAlways表示屏幕向下滑动时，标题栏同时向下活动并显示；
 * snap表示Toolbar没有完全显示或隐藏时，根据滚动距离，自动选择。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lexample/scroll/scroll_stop/ScrollingStopTopActivity;", "Lcom/style/base/BaseActivity;", "()V", "bd", "Lcom/style/framework/databinding/ActivityScrollingStopTopBinding;", "dataList", "Ljava/util/ArrayList;", "", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mContentAdapter", "Lexample/scroll/scroll_stop/ScrollStopContentAdapter;", "mTitleAdapter", "Lexample/scroll/scroll_stop/ScrollStopTitleAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app__sharp_R3_9_0_0_Debug"})
public final class ScrollingStopTopActivity extends com.style.base.BaseActivity {
    private com.style.framework.databinding.ActivityScrollingStopTopBinding bd;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private java.util.ArrayList<java.lang.String> dataList;
    private example.scroll.scroll_stop.ScrollStopTitleAdapter mTitleAdapter;
    private example.scroll.scroll_stop.ScrollStopContentAdapter mContentAdapter;
    
    public ScrollingStopTopActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}