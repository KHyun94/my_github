// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.di;

import com.kh.my_github.data.datasource.TokenRemoteDataSource;
import com.kh.my_github.data.network.service.TokenService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataModule_ProvideTokenRemoteDataSourceFactory implements Factory<TokenRemoteDataSource> {
  private final Provider<TokenService> serviceProvider;

  public DataModule_ProvideTokenRemoteDataSourceFactory(Provider<TokenService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public TokenRemoteDataSource get() {
    return provideTokenRemoteDataSource(serviceProvider.get());
  }

  public static DataModule_ProvideTokenRemoteDataSourceFactory create(
      Provider<TokenService> serviceProvider) {
    return new DataModule_ProvideTokenRemoteDataSourceFactory(serviceProvider);
  }

  public static TokenRemoteDataSource provideTokenRemoteDataSource(TokenService service) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideTokenRemoteDataSource(service));
  }
}
