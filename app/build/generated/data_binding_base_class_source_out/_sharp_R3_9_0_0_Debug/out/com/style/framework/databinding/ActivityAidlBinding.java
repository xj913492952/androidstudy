// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAidlBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvLaunch;

  @NonNull
  public final TextView tvOpenActivityWithMimeType;

  @NonNull
  public final TextView tvOpenOtherAppActivity;

  @NonNull
  public final TextView tvScheme;

  @NonNull
  public final TextView tvSendToOtherApp;

  private ActivityAidlBinding(@NonNull LinearLayout rootView, @NonNull TextView tvLaunch,
      @NonNull TextView tvOpenActivityWithMimeType, @NonNull TextView tvOpenOtherAppActivity,
      @NonNull TextView tvScheme, @NonNull TextView tvSendToOtherApp) {
    this.rootView = rootView;
    this.tvLaunch = tvLaunch;
    this.tvOpenActivityWithMimeType = tvOpenActivityWithMimeType;
    this.tvOpenOtherAppActivity = tvOpenOtherAppActivity;
    this.tvScheme = tvScheme;
    this.tvSendToOtherApp = tvSendToOtherApp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAidlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAidlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_aidl, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAidlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_launch;
      TextView tvLaunch = ViewBindings.findChildViewById(rootView, id);
      if (tvLaunch == null) {
        break missingId;
      }

      id = R.id.tv_open_activity_with_mime_type;
      TextView tvOpenActivityWithMimeType = ViewBindings.findChildViewById(rootView, id);
      if (tvOpenActivityWithMimeType == null) {
        break missingId;
      }

      id = R.id.tv_open_other_app_activity;
      TextView tvOpenOtherAppActivity = ViewBindings.findChildViewById(rootView, id);
      if (tvOpenOtherAppActivity == null) {
        break missingId;
      }

      id = R.id.tv_scheme;
      TextView tvScheme = ViewBindings.findChildViewById(rootView, id);
      if (tvScheme == null) {
        break missingId;
      }

      id = R.id.tv_send_to_other_app;
      TextView tvSendToOtherApp = ViewBindings.findChildViewById(rootView, id);
      if (tvSendToOtherApp == null) {
        break missingId;
      }

      return new ActivityAidlBinding((LinearLayout) rootView, tvLaunch, tvOpenActivityWithMimeType,
          tvOpenOtherAppActivity, tvScheme, tvSendToOtherApp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}