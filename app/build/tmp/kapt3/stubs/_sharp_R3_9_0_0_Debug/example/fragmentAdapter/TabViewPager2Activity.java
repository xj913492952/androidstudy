package example.fragmentAdapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lexample/fragmentAdapter/TabViewPager2Activity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "bd", "Lcom/style/framework/databinding/TablayoutWithViewpager2ActivityBinding;", "fAdapter", "Lexample/fragmentAdapter/TabViewPager2Activity$IndexFragmentAdapter;", "fragments", "Ljava/util/ArrayList;", "Lexample/fragmentAdapter/TabFragment;", "titles", "", "onCreate", "", "arg0", "Landroid/os/Bundle;", "IndexFragmentAdapter", "app__sharp_R3_9_0_0_Debug"})
public final class TabViewPager2Activity extends com.style.base.BaseTitleBarActivity {
    private com.style.framework.databinding.TablayoutWithViewpager2ActivityBinding bd;
    private example.fragmentAdapter.TabViewPager2Activity.IndexFragmentAdapter fAdapter;
    private final java.util.ArrayList<example.fragmentAdapter.TabFragment> fragments = null;
    private final java.util.ArrayList<java.lang.String> titles = null;
    
    public TabViewPager2Activity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lexample/fragmentAdapter/TabViewPager2Activity$IndexFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "fragments", "Ljava/util/ArrayList;", "Lexample/fragmentAdapter/TabFragment;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app__sharp_R3_9_0_0_Debug"})
    public static final class IndexFragmentAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        private final java.util.ArrayList<example.fragmentAdapter.TabFragment> fragments = null;
        
        public IndexFragmentAdapter(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentActivity fa, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<example.fragmentAdapter.TabFragment> fragments) {
            super(null);
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}