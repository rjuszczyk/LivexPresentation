// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ResendActivity$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.ResendActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558539, "field 'info'");
    target.info = finder.castView(view, 2131558539, "field 'info'");
    view = finder.findRequiredView(source, 2131558543, "field 'progressBar'");
    target.progressBar = view;
  }

  @Override public void unbind(T target) {
    target.info = null;
    target.progressBar = null;
  }
}
