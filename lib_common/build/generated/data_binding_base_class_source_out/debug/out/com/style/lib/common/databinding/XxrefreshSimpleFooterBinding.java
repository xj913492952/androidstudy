// Generated by view binder compiler. Do not edit!
package com.style.lib.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class XxrefreshSimpleFooterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView xxrefreshSimpleFooterTvLoadMore;

  private XxrefreshSimpleFooterBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView xxrefreshSimpleFooterTvLoadMore) {
    this.rootView = rootView;
    this.xxrefreshSimpleFooterTvLoadMore = xxrefreshSimpleFooterTvLoadMore;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static XxrefreshSimpleFooterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static XxrefreshSimpleFooterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.xxrefresh_simple_footer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static XxrefreshSimpleFooterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.xxrefresh_simple_footer_tv_load_more;
      TextView xxrefreshSimpleFooterTvLoadMore = ViewBindings.findChildViewById(rootView, id);
      if (xxrefreshSimpleFooterTvLoadMore == null) {
        break missingId;
      }

      return new XxrefreshSimpleFooterBinding((RelativeLayout) rootView,
          xxrefreshSimpleFooterTvLoadMore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}