// Generated by view binder compiler. Do not edit!
package com.style.lib.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.lib.common.R;
import com.style.view.progressbar.CircleArcProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLoadingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleArcProgressBar indeterminateProgress;

  @NonNull
  public final LinearLayout relaDialog;

  @NonNull
  public final TextView tvLoadingInfo;

  private DialogLoadingBinding(@NonNull LinearLayout rootView,
      @NonNull CircleArcProgressBar indeterminateProgress, @NonNull LinearLayout relaDialog,
      @NonNull TextView tvLoadingInfo) {
    this.rootView = rootView;
    this.indeterminateProgress = indeterminateProgress;
    this.relaDialog = relaDialog;
    this.tvLoadingInfo = tvLoadingInfo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_loading, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLoadingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.indeterminate_progress;
      CircleArcProgressBar indeterminateProgress = ViewBindings.findChildViewById(rootView, id);
      if (indeterminateProgress == null) {
        break missingId;
      }

      LinearLayout relaDialog = (LinearLayout) rootView;

      id = R.id.tv_loading_info;
      TextView tvLoadingInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvLoadingInfo == null) {
        break missingId;
      }

      return new DialogLoadingBinding((LinearLayout) rootView, indeterminateProgress, relaDialog,
          tvLoadingInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
