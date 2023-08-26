package com.style.base;

import java.lang.System;

/**
 * Created by xiajun on 2018/7/13.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0013H\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0004J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004J\b\u0010\"\u001a\u00020\u0019H\u0014J\b\u0010#\u001a\u00020\u0019H\u0004J\b\u0010$\u001a\u00020\u0019H\u0004J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0004J\u0012\u0010%\u001a\u00020\u00192\b\b\u0001\u0010(\u001a\u00020)H\u0004R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/style/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "generalFinish", "Landroidx/lifecycle/MutableLiveData;", "", "getGeneralFinish", "()Landroidx/lifecycle/MutableLiveData;", "requestState", "getRequestState", "singleTasks", "", "Lio/reactivex/disposables/Disposable;", "tasks", "Lio/reactivex/disposables/CompositeDisposable;", "addSingleTask", "d", "addTask", "", "getDataBase", "Lcom/style/data/db/AppDatabase;", "getPreferences", "Lcom/style/data/prefs/AppPrefsManager;", "logE", "tag", "msg", "logI", "onCleared", "removeAllTask", "removeSingleTask", "showToast", "str", "", "resId", "", "app__sharp_R3_9_0_0_Debug"})
public abstract class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> requestState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> generalFinish = null;
    private final io.reactivex.disposables.CompositeDisposable tasks = null;
    private java.util.List<io.reactivex.disposables.Disposable> singleTasks;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRequestState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGeneralFinish() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.style.data.prefs.AppPrefsManager getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.style.data.db.AppDatabase getDataBase() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    protected final void addTask(@org.jetbrains.annotations.NotNull
    io.reactivex.disposables.Disposable d) {
    }
    
    protected final void removeAllTask() {
    }
    
    /**
     * 频繁重复请求时
     *
     * @param d
     * @return
     */
    protected final boolean addSingleTask(@org.jetbrains.annotations.NotNull
    io.reactivex.disposables.Disposable d) {
        return false;
    }
    
    protected final void removeSingleTask() {
    }
    
    protected final void showToast(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence str) {
    }
    
    protected final void showToast(@androidx.annotation.StringRes
    int resId) {
    }
    
    protected final void logI(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    protected final void logE(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
}