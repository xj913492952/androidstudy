package example.viewPagerBanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lexample/viewPagerBanner/BannerActivity;", "Lcom/style/base/BaseActivity;", "()V", "bannerFrags", "Ljava/util/ArrayList;", "Lexample/viewPagerBanner/BannerFragment;", "Lkotlin/collections/ArrayList;", "bd", "Lcom/style/framework/databinding/BannerActivityBinding;", "fAdapter", "Lexample/viewPagerBanner/BannerActivity$BannerAdapter;", "fadeIn", "", "fadeOut", "mPageIndex", "onCreate", "", "arg0", "Landroid/os/Bundle;", "onPause", "onStart", "resetPhotoView", "setRequestedOrientation", "requestedOrientation", "BannerAdapter", "IndicatorAdapter", "app__sharp_R3_9_0_0_Debug"})
public final class BannerActivity extends com.style.base.BaseActivity {
    private com.style.framework.databinding.BannerActivityBinding bd;
    private java.util.ArrayList<example.viewPagerBanner.BannerFragment> bannerFrags;
    private example.viewPagerBanner.BannerActivity.BannerAdapter fAdapter;
    private int mPageIndex = 0;
    private final int fadeIn = 0;
    private final int fadeOut = 0;
    
    public BannerActivity() {
        super();
    }
    
    @java.lang.Override
    public void setRequestedOrientation(int requestedOrientation) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    private final void resetPhotoView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lexample/viewPagerBanner/BannerActivity$BannerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "list_fragment", "Ljava/util/ArrayList;", "Lexample/viewPagerBanner/BannerFragment;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app__sharp_R3_9_0_0_Debug"})
    public static final class BannerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        private final java.util.ArrayList<example.viewPagerBanner.BannerFragment> list_fragment = null;
        
        public BannerAdapter(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentActivity fa, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<example.viewPagerBanner.BannerFragment> list_fragment) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B)\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e\u00a8\u0006\u0016"}, d2 = {"Lexample/viewPagerBanner/BannerActivity$IndicatorAdapter;", "Lcom/style/base/BaseRecyclerViewAdapter;", "", "context", "Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "onBindViewHolder", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelected", "i", "ViewHolder", "app__sharp_R3_9_0_0_Debug"})
    public static final class IndicatorAdapter extends com.style.base.BaseRecyclerViewAdapter<java.lang.Boolean> {
        
        public IndicatorAdapter(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<java.lang.Boolean> dataList) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int position) {
        }
        
        public final void setSelected(int i) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lexample/viewPagerBanner/BannerActivity$IndicatorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bd", "Lcom/style/framework/databinding/AdapterIndicatorBinding;", "(Lcom/style/framework/databinding/AdapterIndicatorBinding;)V", "getBd", "()Lcom/style/framework/databinding/AdapterIndicatorBinding;", "setBd", "app__sharp_R3_9_0_0_Debug"})
        public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull
            private com.style.framework.databinding.AdapterIndicatorBinding bd;
            
            @org.jetbrains.annotations.NotNull
            public final com.style.framework.databinding.AdapterIndicatorBinding getBd() {
                return null;
            }
            
            public final void setBd(@org.jetbrains.annotations.NotNull
            com.style.framework.databinding.AdapterIndicatorBinding p0) {
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull
            com.style.framework.databinding.AdapterIndicatorBinding bd) {
                super(null);
            }
        }
    }
}