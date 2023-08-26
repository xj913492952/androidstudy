// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class AdapterBluetoothBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final Button tvBondState;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvProfileState;

  @NonNull
  public final TextView tvRssi;

  @NonNull
  public final TextView tvType;

  private AdapterBluetoothBinding(@NonNull LinearLayout rootView, @NonNull TextView tvAddress,
      @NonNull Button tvBondState, @NonNull TextView tvName, @NonNull TextView tvProfileState,
      @NonNull TextView tvRssi, @NonNull TextView tvType) {
    this.rootView = rootView;
    this.tvAddress = tvAddress;
    this.tvBondState = tvBondState;
    this.tvName = tvName;
    this.tvProfileState = tvProfileState;
    this.tvRssi = tvRssi;
    this.tvType = tvType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterBluetoothBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterBluetoothBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_bluetooth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterBluetoothBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_address;
      TextView tvAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvAddress == null) {
        break missingId;
      }

      id = R.id.tv_bondState;
      Button tvBondState = ViewBindings.findChildViewById(rootView, id);
      if (tvBondState == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_profile_state;
      TextView tvProfileState = ViewBindings.findChildViewById(rootView, id);
      if (tvProfileState == null) {
        break missingId;
      }

      id = R.id.tv_rssi;
      TextView tvRssi = ViewBindings.findChildViewById(rootView, id);
      if (tvRssi == null) {
        break missingId;
      }

      id = R.id.tv_type;
      TextView tvType = ViewBindings.findChildViewById(rootView, id);
      if (tvType == null) {
        break missingId;
      }

      return new AdapterBluetoothBinding((LinearLayout) rootView, tvAddress, tvBondState, tvName,
          tvProfileState, tvRssi, tvType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}