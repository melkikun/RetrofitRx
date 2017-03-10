// Generated code from Butter Knife. Do not modify!
package com.example.it01.retrofitrx.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.retrofitrx.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailDrawing_ViewBinding implements Unbinder {
  private DetailDrawing target;

  private View view2131558522;

  @UiThread
  public DetailDrawing_ViewBinding(DetailDrawing target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailDrawing_ViewBinding(final DetailDrawing target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_detail_drawing, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.fragment, "method 'goFragment'");
    view2131558522 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goFragment(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailDrawing target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;

    view2131558522.setOnClickListener(null);
    view2131558522 = null;
  }
}
