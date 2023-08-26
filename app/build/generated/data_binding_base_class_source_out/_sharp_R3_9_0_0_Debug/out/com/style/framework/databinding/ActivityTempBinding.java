// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import com.style.view.healthy.TemperatureLineBg;
import com.style.view.healthy.TemperatureLineNew;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTempBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnRefresh;

  @NonNull
  public final HorizontalScrollView scrollView;

  @NonNull
  public final TemperatureLineNew temperatureLine;

  @NonNull
  public final TemperatureLineBg temperatureLineBg;

  private ActivityTempBinding(@NonNull LinearLayout rootView, @NonNull Button btnRefresh,
      @NonNull HorizontalScrollView scrollView, @NonNull TemperatureLineNew temperatureLine,
      @NonNull TemperatureLineBg temperatureLineBg) {
    this.rootView = rootView;
    this.btnRefresh = btnRefresh;
    this.scrollView = scrollView;
    this.temperatureLine = temperatureLine;
    this.temperatureLineBg = temperatureLineBg;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTempBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTempBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_temp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTempBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_refresh;
      Button btnRefresh = ViewBindings.findChildViewById(rootView, id);
      if (btnRefresh == null) {
        break missingId;
      }

      id = R.id.scrollView;
      HorizontalScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.temperature_line;
      TemperatureLineNew temperatureLine = ViewBindings.findChildViewById(rootView, id);
      if (temperatureLine == null) {
        break missingId;
      }

      id = R.id.temperature_line_bg;
      TemperatureLineBg temperatureLineBg = ViewBindings.findChildViewById(rootView, id);
      if (temperatureLineBg == null) {
        break missingId;
      }

      return new ActivityTempBinding((LinearLayout) rootView, btnRefresh, scrollView,
          temperatureLine, temperatureLineBg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
