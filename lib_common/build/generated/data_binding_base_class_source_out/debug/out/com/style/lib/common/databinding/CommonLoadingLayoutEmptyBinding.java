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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CommonLoadingLayoutEmptyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView commonLoadingLayoutTvEmpty;

  private CommonLoadingLayoutEmptyBinding(@NonNull LinearLayout rootView,
      @NonNull TextView commonLoadingLayoutTvEmpty) {
    this.rootView = rootView;
    this.commonLoadingLayoutTvEmpty = commonLoadingLayoutTvEmpty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CommonLoadingLayoutEmptyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CommonLoadingLayoutEmptyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.common_loading_layout_empty, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CommonLoadingLayoutEmptyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.common_loading_layout_tv_empty;
      TextView commonLoadingLayoutTvEmpty = ViewBindings.findChildViewById(rootView, id);
      if (commonLoadingLayoutTvEmpty == null) {
        break missingId;
      }

      return new CommonLoadingLayoutEmptyBinding((LinearLayout) rootView,
          commonLoadingLayoutTvEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
