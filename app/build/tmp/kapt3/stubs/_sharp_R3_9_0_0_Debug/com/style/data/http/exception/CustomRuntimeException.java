package com.style.data.http.exception;

import java.lang.System;

/**
 * 因为RuntimeException不会在编译时提示捕获，相当于隐式传递异常，为了安全起见。
 * 最好在需要时抛出此异常以便捕获。
 * 注：kotlin不提示抛出任何异常。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/style/data/http/exception/CustomRuntimeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app__sharp_R3_9_0_0_Debug"})
public final class CustomRuntimeException extends java.lang.Exception {
    
    public CustomRuntimeException(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
        super();
    }
}