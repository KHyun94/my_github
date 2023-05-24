package com.kh.my_github.di;

/**
 * Data module(Data Layer 관련 모듈)
 *
 * @constructor Create empty Data module
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\rH\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/kh/my_github/di/DataModule;", "", "()V", "provideDataStoreManager", "Lcom/kh/my_github/data/db/DataStoreManager;", "context", "Landroid/content/Context;", "provideLoginRepository", "Lcom/kh/my_github/data/repository/LoginRepository;", "remoteDataSource", "Lcom/kh/my_github/data/datasource/TokenRemoteDataSource;", "dataStoreManager", "provideReposPagingDataSource", "Lcom/kh/my_github/data/datasource/RepoPagingSource;", "repoService", "Lcom/kh/my_github/data/network/service/RepoService;", "provideTokenRemoteDataSource", "service", "Lcom/kh/my_github/data/network/service/TokenService;", "provideUserRemoteDataSource", "Lcom/kh/my_github/data/datasource/GitHubApiRemoteDataSource;", "userService", "Lcom/kh/my_github/data/network/service/UserService;", "provideUserRepository", "Lcom/kh/my_github/data/repository/GitHubApiRepository;", "repoPagingSource", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.kh.my_github.di.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    /**
     * Provide data store manager
     *
     * @param context
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.db.DataStoreManager provideDataStoreManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Provide token remote data source
     *
     * @param service
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.datasource.TokenRemoteDataSource provideTokenRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.TokenService service) {
        return null;
    }
    
    /**
     * Provide token remote data source
     *
     * @param service
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.datasource.GitHubApiRemoteDataSource provideUserRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.UserService userService, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.RepoService repoService) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.datasource.RepoPagingSource provideReposPagingDataSource(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.RepoService repoService) {
        return null;
    }
    
    /**
     * Provide data store manager
     *
     * @param context
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.repository.LoginRepository provideLoginRepository(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.TokenRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.db.DataStoreManager dataStoreManager) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.repository.GitHubApiRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.GitHubApiRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.RepoPagingSource repoPagingSource) {
        return null;
    }
}