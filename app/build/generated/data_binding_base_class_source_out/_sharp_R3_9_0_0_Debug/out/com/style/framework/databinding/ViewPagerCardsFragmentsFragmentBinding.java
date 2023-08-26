// Generated by view binder compiler. Do not edit!
package com.style.framework.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.style.framework.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewPagerCardsFragmentsFragmentBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final Button ivBtn;

  private ViewPagerCardsFragmentsFragmentBinding(@NonNull CardView rootView,
      @NonNull CardView cardView, @NonNull Button ivBtn) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.ivBtn = ivBtn;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewPagerCardsFragmentsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewPagerCardsFragmentsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_pager_cards_fragments_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewPagerCardsFragmentsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.iv_btn;
      Button ivBtn = ViewBindings.findChildViewById(rootView, id);
      if (ivBtn == null) {
        break missingId;
      }

      return new ViewPagerCardsFragmentsFragmentBinding((CardView) rootView, cardView, ivBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
