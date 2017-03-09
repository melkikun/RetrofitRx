// Generated code from Butter Knife. Do not modify!
package com.example.it01.retrofitrx.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.retrofitrx.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailDrawing_ViewBinding implements Unbinder {
  private DetailDrawing target;

  @UiThread
  public DetailDrawing_ViewBinding(DetailDrawing target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailDrawing_ViewBinding(DetailDrawing target, View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.id, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailDrawing target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
  }
}
