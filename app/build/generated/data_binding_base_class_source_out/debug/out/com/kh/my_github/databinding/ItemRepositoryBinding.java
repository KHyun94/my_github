// Generated by data binding compiler. Do not edit!
package com.kh.my_github.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kh.my_github.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRepositoryBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout layoutParent;

  @Bindable
  protected String mItem;

  protected ItemRepositoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout layoutParent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutParent = layoutParent;
  }

  public abstract void setItem(@Nullable String item);

  @Nullable
  public String getItem() {
    return mItem;
  }

  @NonNull
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_repository, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRepositoryBinding>inflateInternal(inflater, R.layout.item_repository, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_repository, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRepositoryBinding>inflateInternal(inflater, R.layout.item_repository, null, false, component);
  }

  public static ItemRepositoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemRepositoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRepositoryBinding)bind(component, view, R.layout.item_repository);
  }
}
