// Generated by Dagger (https://dagger.dev).
package com.kh.my_github.presentation.viewmodel;

import com.kh.my_github.data.repository.GitHubApiRepository;
import com.kh.my_github.data.repository.LoginRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<GitHubApiRepository> gitHubApiRepoProvider;

  private final Provider<LoginRepository> loginRepoProvider;

  public MainViewModel_Factory(Provider<GitHubApiRepository> gitHubApiRepoProvider,
      Provider<LoginRepository> loginRepoProvider) {
    this.gitHubApiRepoProvider = gitHubApiRepoProvider;
    this.loginRepoProvider = loginRepoProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(gitHubApiRepoProvider.get(), loginRepoProvider.get());
  }

  public static MainViewModel_Factory create(Provider<GitHubApiRepository> gitHubApiRepoProvider,
      Provider<LoginRepository> loginRepoProvider) {
    return new MainViewModel_Factory(gitHubApiRepoProvider, loginRepoProvider);
  }

  public static MainViewModel newInstance(GitHubApiRepository gitHubApiRepo,
      LoginRepository loginRepo) {
    return new MainViewModel(gitHubApiRepo, loginRepo);
  }
}
