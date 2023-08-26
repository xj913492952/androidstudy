package com.style.app;

import java.lang.System;

/**
 * 避免广播action重复混乱，广播action最好统一放在这里
 * Created by xiajun on 2016/11/25.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/style/app/MyAction;", "", "()V", "Companion", "app__sharp_R3_9_0_0_Debug"})
public final class MyAction {
    @org.jetbrains.annotations.NotNull
    public static final com.style.app.MyAction.Companion Companion = null;
    
    /**
     * 广播action
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_REFRESH_CONVERSATION = "action.refresh.conversation";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_PREPARE_DOWNLOAD = "action.file.prepare.download";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_GET_FAIL = "action.file.get.fail";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_CREATE_FAIL = "action.file.create.fail";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_DOWNING = "action.file.downing";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_CANCEL_DOWNLOAD = "action.file.cancel.download";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_DOWN_COMPLETE = "action.file.down.complete";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_FILE_DOWN_FAIL = "action.file.down.fail";
    
    public MyAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/style/app/MyAction$Companion;", "", "()V", "ACTION_FILE_CANCEL_DOWNLOAD", "", "ACTION_FILE_CREATE_FAIL", "ACTION_FILE_DOWNING", "ACTION_FILE_DOWN_COMPLETE", "ACTION_FILE_DOWN_FAIL", "ACTION_FILE_GET_FAIL", "ACTION_FILE_PREPARE_DOWNLOAD", "ACTION_REFRESH_CONVERSATION", "app__sharp_R3_9_0_0_Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}