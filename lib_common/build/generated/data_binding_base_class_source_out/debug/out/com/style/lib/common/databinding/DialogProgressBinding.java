// Generated by view binder compiler. Do not edit!
package com.style.lib.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.lib.common.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogProgressBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView ivProgress;

  private DialogProgressBinding(@NonNull FrameLayout rootView, @NonNull ImageView ivProgress) {
    this.rootView = rootView;
    this.ivProgress = ivProgress;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_progress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogProgressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_progress;
      ImageView ivProgress = ViewBindings.findChildViewById(rootView, id);
      if (ivProgress == null) {
        break missingId;
      }

      return new DialogProgressBinding((FrameLayout) rootView, ivProgress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
