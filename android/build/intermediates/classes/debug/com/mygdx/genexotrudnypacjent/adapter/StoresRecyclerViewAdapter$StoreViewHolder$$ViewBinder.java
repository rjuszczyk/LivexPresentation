// Generated code from Butter Knife. Do not modify!
package com.mygdx.genexotrudnypacjent.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoresRecyclerViewAdapter$StoreViewHolder$$ViewBinder<T extends com.mygdx.genexotrudnypacjent.adapter.StoresRecyclerViewAdapter.StoreViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558519, "field 'mStoreName'");
    target.mStoreName = finder.castView(view, 2131558519, "field 'mStoreName'");
    view = finder.findOptionalView(source, 2131558520, null);
    target.mSecondLine = finder.castView(view, 2131558520, "field 'mSecondLine'");
  }

  @Override public void unbind(T target) {
    target.mStoreName = null;
    target.mSecondLine = null;
  }
}
