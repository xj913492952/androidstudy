package example.filedown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u001e\u0010\u0012\u001a\u00020\u00102\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lexample/filedown/FileDownListViewModel;", "Lcom/style/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "fileNames", "Ljava/util/ArrayList;", "", "files", "Landroidx/lifecycle/MutableLiveData;", "Lcom/style/data/fileDown/entity/CustomFileBean;", "getFiles", "()Landroidx/lifecycle/MutableLiveData;", "titles", "urls", "continueDownloadFile", "", "f", "downloadAllFile", "dataList", "Lkotlin/collections/ArrayList;", "getData", "newDownloadFile", "pauseDownloadFile", "data", "app__sharp_R3_9_0_0_Debug"})
public final class FileDownListViewModel extends com.style.base.BaseViewModel {
    private final java.util.ArrayList<java.lang.String> urls = null;
    private final java.util.ArrayList<java.lang.String> titles = null;
    private final java.util.ArrayList<java.lang.String> fileNames = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean>> files = null;
    
    public FileDownListViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean>> getFiles() {
        return null;
    }
    
    public final void getData() {
    }
    
    public final void downloadAllFile(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.style.data.fileDown.entity.CustomFileBean> dataList) {
    }
    
    public final void pauseDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean data) {
    }
    
    public final void newDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean f) {
    }
    
    public final void continueDownloadFile(@org.jetbrains.annotations.NotNull
    com.style.data.fileDown.entity.CustomFileBean f) {
    }
}