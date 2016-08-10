// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BasePresentationActivity$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.BasePresentationActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558541, "method 'goToMainPage'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.goToMainPage(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558523, "method 'onNext'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNext(p0);
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
