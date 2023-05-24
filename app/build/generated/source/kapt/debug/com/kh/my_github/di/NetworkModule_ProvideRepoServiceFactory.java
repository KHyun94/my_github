// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.di;

import com.kh.my_github.data.network.service.RepoService;
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
public final class NetworkModule_ProvideRepoServiceFactory implements Factory<RepoService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideRepoServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RepoService get() {
    return provideRepoService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideRepoServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideRepoServiceFactory(retrofitProvider);
  }

  public static RepoService provideRepoService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRepoService(retrofit));
  }
}
