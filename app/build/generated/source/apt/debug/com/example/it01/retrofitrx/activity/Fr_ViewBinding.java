// Generated code from Butter Knife. Do not modify!
package com.example.it01.retrofitrx.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.retrofitrx.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Fr_ViewBinding implements Unbinder {
  private Fr target;

  private View view2131558524;

  private View view2131558525;

  @UiThread
  public Fr_ViewBinding(Fr target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Fr_ViewBinding(final Fr target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn1, "method 'btn1Click'");
    view2131558524 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btn1Click(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn2, "method 'btn2Click'");
    view2131558525 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btn2Click(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558524.setOnClickListener(null);
    view2131558524 = null;
    view2131558525.setOnClickListener(null);
    view2131558525 = null;
  }
}
