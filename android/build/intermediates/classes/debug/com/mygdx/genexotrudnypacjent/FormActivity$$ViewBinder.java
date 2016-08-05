// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FormActivity$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.FormActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558513, "field 'mPrzedstawicielMedyczny'");
    target.mPrzedstawicielMedyczny = finder.castView(view, 2131558513, "field 'mPrzedstawicielMedyczny'");
    view = finder.findRequiredView(source, 2131558514, "field 'mMiasto'");
    target.mMiasto = finder.castView(view, 2131558514, "field 'mMiasto'");
    view = finder.findRequiredView(source, 2131558515, "field 'mApteka'");
    target.mApteka = finder.castView(view, 2131558515, "field 'mApteka'");
    view = finder.findRequiredView(source, 2131558512, "field 'mQuiz' and method 'onDalej'");
    target.mQuiz = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onDalej(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558517, "field 'mImie'");
    target.mImie = finder.castView(view, 2131558517, "field 'mImie'");
  }

  @Override public void unbind(T target) {
    target.mPrzedstawicielMedyczny = null;
    target.mMiasto = null;
    target.mApteka = null;
    target.mQuiz = null;
    target.mImie = null;
  }
}
