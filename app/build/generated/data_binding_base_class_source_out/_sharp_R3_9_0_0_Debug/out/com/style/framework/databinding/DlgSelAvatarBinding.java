// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DlgSelAvatarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button itemCamera;

  @NonNull
  public final Button itemCancel;

  @NonNull
  public final Button itemPhoto;

  @NonNull
  public final LinearLayout llPopup;

  private DlgSelAvatarBinding(@NonNull LinearLayout rootView, @NonNull Button itemCamera,
      @NonNull Button itemCancel, @NonNull Button itemPhoto, @NonNull LinearLayout llPopup) {
    this.rootView = rootView;
    this.itemCamera = itemCamera;
    this.itemCancel = itemCancel;
    this.itemPhoto = itemPhoto;
    this.llPopup = llPopup;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DlgSelAvatarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DlgSelAvatarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dlg_sel_avatar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DlgSelAvatarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_camera;
      Button itemCamera = ViewBindings.findChildViewById(rootView, id);
      if (itemCamera == null) {
        break missingId;
      }

      id = R.id.item_cancel;
      Button itemCancel = ViewBindings.findChildViewById(rootView, id);
      if (itemCancel == null) {
        break missingId;
      }

      id = R.id.item_photo;
      Button itemPhoto = ViewBindings.findChildViewById(rootView, id);
      if (itemPhoto == null) {
        break missingId;
      }

      LinearLayout llPopup = (LinearLayout) rootView;

      return new DlgSelAvatarBinding((LinearLayout) rootView, itemCamera, itemCancel, itemPhoto,
          llPopup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
