package example.album;

import java.lang.System;

/**
 * Created by xiajun on 2016/10/8.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0003J\b\u0010\u001f\u001a\u00020\u001eH\u0003J\b\u0010 \u001a\u00020\u001eH\u0007J\"\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u001eJ\u0006\u0010-\u001a\u00020\u001eJ\u0006\u0010.\u001a\u00020\u001eJ\b\u0010/\u001a\u00020\u001eH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00060"}, d2 = {"Lexample/album/SelectLocalPictureActivity;", "Lcom/style/base/BaseTitleBarActivity;", "()V", "CODE_TAKE_CAMERA", "", "getCODE_TAKE_CAMERA", "()I", "TAG_ADD", "Lcom/dmcbig/mediapicker/entity/Media;", "adapter", "Lexample/album/DynamicPublishImageAdapter;", "bd", "Lcom/style/framework/databinding/ActivitySelectLocalPictureBinding;", "getBd", "()Lcom/style/framework/databinding/ActivitySelectLocalPictureBinding;", "setBd", "(Lcom/style/framework/databinding/ActivitySelectLocalPictureBinding;)V", "dialog", "Lcom/style/dialog/SelAvatarDialog;", "haveImg", "", "paths", "Ljava/util/ArrayList;", "photoFile", "Ljava/io/File;", "getPhotoFile", "()Ljava/io/File;", "setPhotoFile", "(Ljava/io/File;)V", "checkSDcardAndCameraPermission", "", "checkSDcardPermission", "compressImage", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "arg0", "Landroid/os/Bundle;", "selAvatar", "v", "Landroid/view/View;", "selectPhotos", "setHaveDynamic", "showSelPicPopupWindow", "takePhoto", "app__sharp_R3_9_0_0_Debug"})
public final class SelectLocalPictureActivity extends com.style.base.BaseTitleBarActivity {
    public com.style.framework.databinding.ActivitySelectLocalPictureBinding bd;
    private com.dmcbig.mediapicker.entity.Media TAG_ADD;
    private example.album.DynamicPublishImageAdapter adapter;
    private java.util.ArrayList<com.dmcbig.mediapicker.entity.Media> paths;
    @org.jetbrains.annotations.Nullable
    private java.io.File photoFile;
    private com.style.dialog.SelAvatarDialog dialog;
    private boolean haveImg = false;
    private final int CODE_TAKE_CAMERA = 997;
    
    public SelectLocalPictureActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.style.framework.databinding.ActivitySelectLocalPictureBinding getBd() {
        return null;
    }
    
    public final void setBd(@org.jetbrains.annotations.NotNull
    com.style.framework.databinding.ActivitySelectLocalPictureBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.io.File getPhotoFile() {
        return null;
    }
    
    protected final void setPhotoFile(@org.jetbrains.annotations.Nullable
    java.io.File p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void compressImage() {
    }
    
    public final void selAvatar(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    public final int getCODE_TAKE_CAMERA() {
        return 0;
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    public final void setHaveDynamic() {
    }
    
    public final void showSelPicPopupWindow() {
    }
    
    public final void selectPhotos() {
    }
    
    private final void takePhoto() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void checkSDcardAndCameraPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void checkSDcardPermission() {
    }
}