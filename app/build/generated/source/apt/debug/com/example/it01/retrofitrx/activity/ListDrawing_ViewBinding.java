// Generated code from Butter Knife. Do not modify!
package com.example.it01.retrofitrx.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.retrofitrx.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListDrawing_ViewBinding implements Unbinder {
  private ListDrawing target;

  @UiThread
  public ListDrawing_ViewBinding(ListDrawing target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListDrawing_ViewBinding(ListDrawing target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.drawing_rv, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListDrawing target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
  }
}
