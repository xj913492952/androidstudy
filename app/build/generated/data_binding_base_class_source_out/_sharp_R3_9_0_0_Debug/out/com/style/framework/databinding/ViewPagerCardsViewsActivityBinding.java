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
import com.style.view.systemHelper.AutoHeightViewPager;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewPagerCardsViewsActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button cardTypeBtn0;

  @NonNull
  public final Button cardTypeBtn1;

  @NonNull
  public final Button cardTypeBtn2;

  @NonNull
  public final Button cardTypeBtn3;

  @NonNull
  public final AutoHeightViewPager viewPager;

  private ViewPagerCardsViewsActivityBinding(@NonNull LinearLayout rootView,
      @NonNull Button cardTypeBtn0, @NonNull Button cardTypeBtn1, @NonNull Button cardTypeBtn2,
      @NonNull Button cardTypeBtn3, @NonNull AutoHeightViewPager viewPager) {
    this.rootView = rootView;
    this.cardTypeBtn0 = cardTypeBtn0;
    this.cardTypeBtn1 = cardTypeBtn1;
    this.cardTypeBtn2 = cardTypeBtn2;
    this.cardTypeBtn3 = cardTypeBtn3;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewPagerCardsViewsActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewPagerCardsViewsActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_pager_cards_views_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewPagerCardsViewsActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardTypeBtn0;
      Button cardTypeBtn0 = ViewBindings.findChildViewById(rootView, id);
      if (cardTypeBtn0 == null) {
        break missingId;
      }

      id = R.id.cardTypeBtn1;
      Button cardTypeBtn1 = ViewBindings.findChildViewById(rootView, id);
      if (cardTypeBtn1 == null) {
        break missingId;
      }

      id = R.id.cardTypeBtn2;
      Button cardTypeBtn2 = ViewBindings.findChildViewById(rootView, id);
      if (cardTypeBtn2 == null) {
        break missingId;
      }

      id = R.id.cardTypeBtn3;
      Button cardTypeBtn3 = ViewBindings.findChildViewById(rootView, id);
      if (cardTypeBtn3 == null) {
        break missingId;
      }

      id = R.id.viewPager;
      AutoHeightViewPager viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ViewPagerCardsViewsActivityBinding((LinearLayout) rootView, cardTypeBtn0,
          cardTypeBtn1, cardTypeBtn2, cardTypeBtn3, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
