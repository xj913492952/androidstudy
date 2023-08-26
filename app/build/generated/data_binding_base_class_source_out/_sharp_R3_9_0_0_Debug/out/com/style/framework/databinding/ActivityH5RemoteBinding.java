// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import com.style.view.progressbar.HorizontalProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityH5RemoteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnLocal;

  @NonNull
  public final HorizontalProgressBar progress;

  @NonNull
  public final WebView webView;

  private ActivityH5RemoteBinding(@NonNull LinearLayout rootView, @NonNull Button btnLocal,
      @NonNull HorizontalProgressBar progress, @NonNull WebView webView) {
    this.rootView = rootView;
    this.btnLocal = btnLocal;
    this.progress = progress;
    this.webView = webView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityH5RemoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityH5RemoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_h5_remote, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityH5RemoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_local;
      Button btnLocal = ViewBindings.findChildViewById(rootView, id);
      if (btnLocal == null) {
        break missingId;
      }

      id = R.id.progress;
      HorizontalProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.webView;
      WebView webView = ViewBindings.findChildViewById(rootView, id);
      if (webView == null) {
        break missingId;
      }

      return new ActivityH5RemoteBinding((LinearLayout) rootView, btnLocal, progress, webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}