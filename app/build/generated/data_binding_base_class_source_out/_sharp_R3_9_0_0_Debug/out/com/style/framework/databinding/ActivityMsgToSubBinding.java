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

public final class ActivityMsgToSubBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvSend;

  private ActivityMsgToSubBinding(@NonNull LinearLayout rootView, @NonNull TextView tvContent,
      @NonNull TextView tvSend) {
    this.rootView = rootView;
    this.tvContent = tvContent;
    this.tvSend = tvSend;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMsgToSubBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMsgToSubBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_msg_to_sub, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMsgToSubBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_content;
      TextView tvContent = ViewBindings.findChildViewById(rootView, id);
      if (tvContent == null) {
        break missingId;
      }

      id = R.id.tv_send;
      TextView tvSend = ViewBindings.findChildViewById(rootView, id);
      if (tvSend == null) {
        break missingId;
      }

      return new ActivityMsgToSubBinding((LinearLayout) rootView, tvContent, tvSend);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
