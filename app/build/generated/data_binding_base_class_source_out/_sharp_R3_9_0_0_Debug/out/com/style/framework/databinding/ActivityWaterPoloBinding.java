// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import com.style.view.progressbar.WaterPoloProgress;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWaterPoloBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final WaterPoloProgress customView;

  private ActivityWaterPoloBinding(@NonNull RelativeLayout rootView, @NonNull Button button,
      @NonNull WaterPoloProgress customView) {
    this.rootView = rootView;
    this.button = button;
    this.customView = customView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWaterPoloBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWaterPoloBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_water_polo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWaterPoloBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.custom_view;
      WaterPoloProgress customView = ViewBindings.findChildViewById(rootView, id);
      if (customView == null) {
        break missingId;
      }

      return new ActivityWaterPoloBinding((RelativeLayout) rootView, button, customView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}