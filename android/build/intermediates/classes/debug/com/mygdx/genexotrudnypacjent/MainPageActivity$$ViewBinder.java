// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainPageActivity$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.MainPageActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558527, "method 'onPrzejdz'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onPrzejdz(p0);
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
    view = finder.findRequiredView(source, 2131558524, "method 'onNext2'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNext2(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558525, "method 'onNext3'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNext3(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558526, "method 'onNext4'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onNext4(p0);
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
