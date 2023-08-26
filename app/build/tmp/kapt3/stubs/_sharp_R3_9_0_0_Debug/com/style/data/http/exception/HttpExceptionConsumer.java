package com.style.data.http.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/style/data/http/exception/HttpExceptionConsumer;", "Lio/reactivex/functions/Consumer;", "", "()V", "accept", "", "e", "onNetworkError", "t", "Lcom/style/http/exception/HttpResultException;", "onOtherError", "onTokenError", "app__sharp_R3_9_0_0_Debug"})
public class HttpExceptionConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
    
    public HttpExceptionConsumer() {
        super();
    }
    
    @java.lang.Override
    public void accept(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e) {
    }
    
    public void onOtherError(@org.jetbrains.annotations.NotNull
    com.style.http.exception.HttpResultException t) {
    }
    
    public void onNetworkError(@org.jetbrains.annotations.NotNull
    com.style.http.exception.HttpResultException t) {
    }
    
    public void onTokenError(@org.jetbrains.annotations.NotNull
    com.style.http.exception.HttpResultException t) {
    }
}