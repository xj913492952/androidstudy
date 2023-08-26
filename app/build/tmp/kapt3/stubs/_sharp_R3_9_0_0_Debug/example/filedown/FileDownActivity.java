package example.filedown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tJ\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tJ\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u001bH\u0003J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tJ$\u0010\u001d\u001a\u00020\u00102\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lexample/filedown/FileDownActivity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "adapter", "Lexample/filedown/FileDownListAdapter;", "bd", "Lcom/style/framework/databinding/FileDownListActivityBinding;", "dataList", "Ljava/util/ArrayList;", "Lcom/style/data/fileDown/entity/CustomFileBean;", "Lkotlin/collections/ArrayList;", "mViewModel", "Lexample/filedown/FileDownListViewModel;", "targetPath", "", "batchDownload", "", "continueDownloadFile", "f", "getData", "multiThreadDownload", "newDownloadFile", "onCreate", "arg0", "Landroid/os/Bundle;", "onDestroy", "onFileDownloadStateChanged", "Lcom/style/data/fileDown/FileDownloadStateBean;", "pauseDownloadFile", "refreshData", "list", "app__sharp_R3_9_0_0_Debug"})
public final class FileDownActivity extends com.style.base.BaseTitleBarActivity {
    private com.style.framework.databinding.FileDownListActivityBinding bd;
    private final java.lang.String targetPath = null;
    private java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean> dataList;
    private example.filedown.FileDownListAdapter adapter;
    private example.filedown.FileDownListViewModel mViewModel;
    
    public FileDownActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    private final void batchDownload() {
    }
    
    public final void pauseDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean f) {
    }
    
    public final void newDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean f) {
    }
    
    public final void continueDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean f) {
    }
    
    private final void getData() {
    }
    
    private final void refreshData(java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean> list) {
    }
    
    @org.simple.eventbus.Subscriber(tag = "file_download_state_changed", mode = org.simple.eventbus.ThreadMode.MAIN)
    private final void onFileDownloadStateChanged(com.style.data.fileDown.FileDownloadStateBean f) {
    }
    
    private final void multiThreadDownload() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}