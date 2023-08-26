// Generated by view binder compiler. Do not edit!
package com.style.lib.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.lib.common.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LibImageCropTitleBarNormalBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivBaseToolbarReturn;

  @NonNull
  public final TextView titleOption;

  @NonNull
  public final TextView tvBaseToolbarTitle;

  private LibImageCropTitleBarNormalBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView ivBaseToolbarReturn, @NonNull TextView titleOption,
      @NonNull TextView tvBaseToolbarTitle) {
    this.rootView = rootView;
    this.ivBaseToolbarReturn = ivBaseToolbarReturn;
    this.titleOption = titleOption;
    this.tvBaseToolbarTitle = tvBaseToolbarTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LibImageCropTitleBarNormalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LibImageCropTitleBarNormalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.lib_image_crop_title_bar_normal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LibImageCropTitleBarNormalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_base_toolbar_Return;
      ImageView ivBaseToolbarReturn = ViewBindings.findChildViewById(rootView, id);
      if (ivBaseToolbarReturn == null) {
        break missingId;
      }

      id = R.id.title_option;
      TextView titleOption = ViewBindings.findChildViewById(rootView, id);
      if (titleOption == null) {
        break missingId;
      }

      id = R.id.tv_base_toolbar_title;
      TextView tvBaseToolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvBaseToolbarTitle == null) {
        break missingId;
      }

      return new LibImageCropTitleBarNormalBinding((RelativeLayout) rootView, ivBaseToolbarReturn,
          titleOption, tvBaseToolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
