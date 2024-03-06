// Generated by view binder compiler. Do not edit!
package com.example.myinsole.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myinsole.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ListView dialoglistview;

  @NonNull
  public final FloatingActionButton floatingbutton;

  @NonNull
  public final TextView floatingbuttontext;

  @NonNull
  public final MaterialCardView function;

  @NonNull
  public final MaterialCardView materialCardView3;

  @NonNull
  public final Button startStopButton;

  @NonNull
  public final TextView stepTitle;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView timeText;

  private FragmentMyHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull ListView dialoglistview, @NonNull FloatingActionButton floatingbutton,
      @NonNull TextView floatingbuttontext, @NonNull MaterialCardView function,
      @NonNull MaterialCardView materialCardView3, @NonNull Button startStopButton,
      @NonNull TextView stepTitle, @NonNull TextView textView, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView timeText) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.dialoglistview = dialoglistview;
    this.floatingbutton = floatingbutton;
    this.floatingbuttontext = floatingbuttontext;
    this.function = function;
    this.materialCardView3 = materialCardView3;
    this.startStopButton = startStopButton;
    this.stepTitle = stepTitle;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.timeText = timeText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.dialoglistview;
      ListView dialoglistview = ViewBindings.findChildViewById(rootView, id);
      if (dialoglistview == null) {
        break missingId;
      }

      id = R.id.floatingbutton;
      FloatingActionButton floatingbutton = ViewBindings.findChildViewById(rootView, id);
      if (floatingbutton == null) {
        break missingId;
      }

      id = R.id.floatingbuttontext;
      TextView floatingbuttontext = ViewBindings.findChildViewById(rootView, id);
      if (floatingbuttontext == null) {
        break missingId;
      }

      id = R.id.function;
      MaterialCardView function = ViewBindings.findChildViewById(rootView, id);
      if (function == null) {
        break missingId;
      }

      id = R.id.materialCardView3;
      MaterialCardView materialCardView3 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView3 == null) {
        break missingId;
      }

      id = R.id.start_stop_button;
      Button startStopButton = ViewBindings.findChildViewById(rootView, id);
      if (startStopButton == null) {
        break missingId;
      }

      id = R.id.step_title;
      TextView stepTitle = ViewBindings.findChildViewById(rootView, id);
      if (stepTitle == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.time_text;
      TextView timeText = ViewBindings.findChildViewById(rootView, id);
      if (timeText == null) {
        break missingId;
      }

      return new FragmentMyHomeBinding((ConstraintLayout) rootView, cardView, dialoglistview,
          floatingbutton, floatingbuttontext, function, materialCardView3, startStopButton,
          stepTitle, textView, textView2, textView3, textView4, timeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
