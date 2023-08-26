package example.login;

import java.lang.System;

/**
 * Created by xiajun on 2018/7/13.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lexample/login/LoginModel;", "Lcom/style/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "loginState", "Landroidx/lifecycle/MutableLiveData;", "", "getLoginState", "()Landroidx/lifecycle/MutableLiveData;", "setLoginState", "(Landroidx/lifecycle/MutableLiveData;)V", "user", "Lcom/style/entity/UserInfo;", "getUser", "setUser", "bytesToHexString", "", "src", "", "getLoginUser", "", "getPubkey", "getThumbPrint", "cert", "Ljava/security/cert/X509Certificate;", "login", "userName", "password", "synData", "app__sharp_R3_9_0_0_Debug"})
public final class LoginModel extends com.style.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.style.entity.UserInfo> user;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginState;
    
    public LoginModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.style.entity.UserInfo> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.style.entity.UserInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoginState() {
        return null;
    }
    
    public final void setLoginState(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void login() {
    }
    
    public final void getLoginUser() {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void synData() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final void getPubkey() throws java.lang.Exception {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.String getThumbPrint(java.security.cert.X509Certificate cert) throws java.lang.Exception {
        return null;
    }
    
    private final java.lang.String bytesToHexString(byte[] src) {
        return null;
    }
}