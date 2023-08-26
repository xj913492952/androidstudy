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

public final class AdapterFriendBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView viewMark;

  @NonNull
  public final TextView viewNick;

  private AdapterFriendBinding(@NonNull LinearLayout rootView, @NonNull TextView viewMark,
      @NonNull TextView viewNick) {
    this.rootView = rootView;
    this.viewMark = viewMark;
    this.viewNick = viewNick;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterFriendBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterFriendBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_friend, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterFriendBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.view_mark;
      TextView viewMark = ViewBindings.findChildViewById(rootView, id);
      if (viewMark == null) {
        break missingId;
      }

      id = R.id.view_nick;
      TextView viewNick = ViewBindings.findChildViewById(rootView, id);
      if (viewNick == null) {
        break missingId;
      }

      return new AdapterFriendBinding((LinearLayout) rootView, viewMark, viewNick);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
