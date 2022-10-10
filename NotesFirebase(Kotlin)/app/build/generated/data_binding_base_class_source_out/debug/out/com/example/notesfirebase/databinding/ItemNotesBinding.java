// Generated by view binder compiler. Do not edit!
package com.example.notesfirebase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notesfirebase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemNotesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView notesDescriptionTv;

  @NonNull
  public final TextView notesTimeTv;

  @NonNull
  public final TextView notesTitleTv;

  private ItemNotesBinding(@NonNull LinearLayout rootView, @NonNull TextView notesDescriptionTv,
      @NonNull TextView notesTimeTv, @NonNull TextView notesTitleTv) {
    this.rootView = rootView;
    this.notesDescriptionTv = notesDescriptionTv;
    this.notesTimeTv = notesTimeTv;
    this.notesTitleTv = notesTitleTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.notesDescriptionTv;
      TextView notesDescriptionTv = ViewBindings.findChildViewById(rootView, id);
      if (notesDescriptionTv == null) {
        break missingId;
      }

      id = R.id.notesTimeTv;
      TextView notesTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (notesTimeTv == null) {
        break missingId;
      }

      id = R.id.notesTitleTv;
      TextView notesTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (notesTitleTv == null) {
        break missingId;
      }

      return new ItemNotesBinding((LinearLayout) rootView, notesDescriptionTv, notesTimeTv,
          notesTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
