// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.di;

import com.kh.my_github.data.network.service.UserService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.kh.my_github.di.PrivateAccess")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideUserServiceFactory implements Factory<UserService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideUserServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserService get() {
    return provideUserService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideUserServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideUserServiceFactory(retrofitProvider);
  }

  public static UserService provideUserService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideUserService(retrofit));
  }
}
