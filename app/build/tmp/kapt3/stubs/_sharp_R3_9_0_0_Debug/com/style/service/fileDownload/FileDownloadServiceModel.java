package com.style.service.fileDownload;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/style/service/fileDownload/FileDownloadServiceModel;", "Lcom/style/base/BaseServiceModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "batchDownloadFile", "", "list", "", "Lcom/style/data/fileDown/entity/CustomFileBean;", "continueDownloadFile", "f", "newDownloadFile", "pauseDownloadFile", "data", "shutdown", "app__sharp_R3_9_0_0_Debug"})
public final class FileDownloadServiceModel extends com.style.base.BaseServiceModel {
    
    public FileDownloadServiceModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
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
    
    public final void batchDownloadFile(@org.jetbrains.annotations.NotNull
    java.util.List<com.style.data.fileDown.entity.CustomFileBean> list) {
    }
    
    public final void shutdown() {
    }
}