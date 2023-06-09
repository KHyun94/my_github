// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.di;

import com.kh.my_github.data.datasource.GitHubApiRemoteDataSource;
import com.kh.my_github.data.datasource.RepoPagingSource;
import com.kh.my_github.data.repository.GitHubApiRepository;
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
public final class DataModule_ProvideUserRepositoryFactory implements Factory<GitHubApiRepository> {
  private final Provider<GitHubApiRemoteDataSource> remoteDataSourceProvider;

  private final Provider<RepoPagingSource> repoPagingSourceProvider;

  public DataModule_ProvideUserRepositoryFactory(
      Provider<GitHubApiRemoteDataSource> remoteDataSourceProvider,
      Provider<RepoPagingSource> repoPagingSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.repoPagingSourceProvider = repoPagingSourceProvider;
  }

  @Override
  public GitHubApiRepository get() {
    return provideUserRepository(remoteDataSourceProvider.get(), repoPagingSourceProvider.get());
  }

  public static DataModule_ProvideUserRepositoryFactory create(
      Provider<GitHubApiRemoteDataSource> remoteDataSourceProvider,
      Provider<RepoPagingSource> repoPagingSourceProvider) {
    return new DataModule_ProvideUserRepositoryFactory(remoteDataSourceProvider, repoPagingSourceProvider);
  }

  public static GitHubApiRepository provideUserRepository(
      GitHubApiRemoteDataSource remoteDataSource, RepoPagingSource repoPagingSource) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideUserRepository(remoteDataSource, repoPagingSource));
  }
}
