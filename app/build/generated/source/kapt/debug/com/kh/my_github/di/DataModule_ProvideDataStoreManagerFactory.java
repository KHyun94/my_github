// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.di;

import android.content.Context;
import com.kh.my_github.data.db.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataModule_ProvideDataStoreManagerFactory implements Factory<DataStoreManager> {
  private final Provider<Context> contextProvider;

  public DataModule_ProvideDataStoreManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreManager get() {
    return provideDataStoreManager(contextProvider.get());
  }

  public static DataModule_ProvideDataStoreManagerFactory create(
      Provider<Context> contextProvider) {
    return new DataModule_ProvideDataStoreManagerFactory(contextProvider);
  }

  public static DataStoreManager provideDataStoreManager(Context context) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideDataStoreManager(context));
  }
}
