package example.filedown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u001f\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0014\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\tR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lexample/filedown/FileDownListAdapter;", "Lcom/style/base/BaseRecyclerViewAdapter;", "Lcom/style/data/fileDown/entity/CustomFileBean;", "context", "Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "mOptionListener", "Lexample/filedown/FileDownListAdapter$OnClickOptionListener;", "getMOptionListener", "()Lexample/filedown/FileDownListAdapter$OnClickOptionListener;", "setMOptionListener", "(Lexample/filedown/FileDownListAdapter$OnClickOptionListener;)V", "onBindViewHolder", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickOptionListener", "listener", "OnClickOptionListener", "ViewHolder", "app__sharp_R3_9_0_0_Debug"})
public final class FileDownListAdapter extends com.style.base.BaseRecyclerViewAdapter<com.style.data.fileDown.entity.CustomFileBean> {
    @org.jetbrains.annotations.Nullable
    private example.filedown.FileDownListAdapter.OnClickOptionListener<com.style.data.fileDown.entity.CustomFileBean> mOptionListener;
    
    @org.jetbrains.annotations.Nullable
    public final example.filedown.FileDownListAdapter.OnClickOptionListener<com.style.data.fileDown.entity.CustomFileBean> getMOptionListener() {
        return null;
    }
    
    public final void setMOptionListener(@org.jetbrains.annotations.Nullable
    example.filedown.FileDownListAdapter.OnClickOptionListener<com.style.data.fileDown.entity.CustomFileBean> p0) {
    }
    
    public FileDownListAdapter(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean> dataList) {
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
    
    public final void setOnClickOptionListener(@org.jetbrains.annotations.NotNull
    example.filedown.FileDownListAdapter.OnClickOptionListener<com.style.data.fileDown.entity.CustomFileBean> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lexample/filedown/FileDownListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bd", "Lcom/style/framework/databinding/FileDownListAdapterBinding;", "(Lcom/style/framework/databinding/FileDownListAdapterBinding;)V", "getBd", "()Lcom/style/framework/databinding/FileDownListAdapterBinding;", "setBd", "app__sharp_R3_9_0_0_Debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.style.framework.databinding.FileDownListAdapterBinding bd;
        
        @org.jetbrains.annotations.NotNull
        public final com.style.framework.databinding.FileDownListAdapterBinding getBd() {
            return null;
        }
        
        public final void setBd(@org.jetbrains.annotations.NotNull
        com.style.framework.databinding.FileDownListAdapterBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.style.framework.databinding.FileDownListAdapterBinding bd) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lexample/filedown/FileDownListAdapter$OnClickOptionListener;", "CustomFileBean", "", "onClickOption", "", "position", "", "data", "(ILjava/lang/Object;)V", "app__sharp_R3_9_0_0_Debug"})
    public static abstract interface OnClickOptionListener<CustomFileBean extends java.lang.Object> {
        
        public abstract void onClickOption(int position, CustomFileBean data);
    }
}