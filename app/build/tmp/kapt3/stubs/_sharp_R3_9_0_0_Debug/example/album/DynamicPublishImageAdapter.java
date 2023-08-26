package example.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lexample/album/DynamicPublishImageAdapter;", "Lcom/style/base/BaseRecyclerViewAdapter;", "Lcom/dmcbig/mediapicker/entity/Media;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "listener", "Lexample/album/DynamicPublishImageAdapter$OnDeleteClickListener;", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnDeleteClickListener", "OnDeleteClickListener", "ViewHolder", "app__sharp_R3_9_0_0_Debug"})
public final class DynamicPublishImageAdapter extends com.style.base.BaseRecyclerViewAdapter<com.dmcbig.mediapicker.entity.Media> {
    private example.album.DynamicPublishImageAdapter.OnDeleteClickListener listener;
    
    public DynamicPublishImageAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.dmcbig.mediapicker.entity.Media> list) {
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
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setOnDeleteClickListener(@org.jetbrains.annotations.NotNull
    example.album.DynamicPublishImageAdapter.OnDeleteClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lexample/album/DynamicPublishImageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bd", "Lcom/style/framework/databinding/AdapterPublishDynamicPictureBinding;", "(Lcom/style/framework/databinding/AdapterPublishDynamicPictureBinding;)V", "getBd", "()Lcom/style/framework/databinding/AdapterPublishDynamicPictureBinding;", "setBd", "app__sharp_R3_9_0_0_Debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.style.framework.databinding.AdapterPublishDynamicPictureBinding bd;
        
        @org.jetbrains.annotations.NotNull
        public final com.style.framework.databinding.AdapterPublishDynamicPictureBinding getBd() {
            return null;
        }
        
        public final void setBd(@org.jetbrains.annotations.NotNull
        com.style.framework.databinding.AdapterPublishDynamicPictureBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.style.framework.databinding.AdapterPublishDynamicPictureBinding bd) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lexample/album/DynamicPublishImageAdapter$OnDeleteClickListener;", "", "onItemClickDelete", "", "position", "", "app__sharp_R3_9_0_0_Debug"})
    public static abstract interface OnDeleteClickListener {
        
        public abstract void onItemClickDelete(int position);
    }
}