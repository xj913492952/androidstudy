package com.style.data.http.function;

import java.lang.System;

/**
 * Created by xiajun on 2017/12/21.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/style/data/http/function/WebNetSourcekt;", "", "getKuaiDi2", "", "type", "postid", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherInfo2", "cityCode", "userID", "app__sharp_R3_9_0_0_Debug"})
public abstract interface WebNetSourcekt {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx/getWeather")
    public abstract java.lang.Object getWeatherInfo2(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Field(value = "theCityCode")
    java.lang.String cityCode, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Field(value = "theUserID")
    java.lang.String userID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "http://www.kuaidi100.com/query?")
    public abstract java.lang.Object getKuaiDi2(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Field(value = "type")
    java.lang.String type, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Field(value = "postid")
    java.lang.String postid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}