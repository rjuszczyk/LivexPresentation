// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StartActivity$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.StartActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558545, "field 'mUpdate' and method 'openUpdate'");
    target.mUpdate = finder.castView(view, 2131558545, "field 'mUpdate'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openUpdate(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mUpdate = null;
  }
}
