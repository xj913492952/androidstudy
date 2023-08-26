// Generated by view binder compiler. Do not edit!
package com.style.lib.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.style.lib.common.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class TitleBarMenuSingleTextBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView tvMenu;

  private TitleBarMenuSingleTextBinding(@NonNull TextView rootView, @NonNull TextView tvMenu) {
    this.rootView = rootView;
    this.tvMenu = tvMenu;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static TitleBarMenuSingleTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TitleBarMenuSingleTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.title_bar_menu_single_text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TitleBarMenuSingleTextBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView tvMenu = (TextView) rootView;

    return new TitleBarMenuSingleTextBinding((TextView) rootView, tvMenu);
  }
}