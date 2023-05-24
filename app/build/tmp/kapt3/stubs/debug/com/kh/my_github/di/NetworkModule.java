package com.kh.my_github.di;

/**
 * 네트워크 관련 모듈
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/kh/my_github/di/NetworkModule;", "", "()V", "providePrivateOkHttpClient", "Lokhttp3/OkHttpClient;", "dataStoreManager", "Lcom/kh/my_github/data/db/DataStoreManager;", "providePrivateRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "providePublicOkHttpClient", "providePublicRetrofit", "provideRepoService", "Lcom/kh/my_github/data/network/service/RepoService;", "retrofit", "provideTokenService", "Lcom/kh/my_github/data/network/service/TokenService;", "provideUserService", "Lcom/kh/my_github/data/network/service/UserService;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.kh.my_github.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @PublicAccess()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient providePublicOkHttpClient() {
        return null;
    }
    
    /**
     * Okhttp Client 모듈
     * - 요청 시 토큰을 RequestIntercepter에서 처리
     * - 통신 중 로그를 남김
     * @param dataStoreManager
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @PrivateAccess()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient providePrivateOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.db.DataStoreManager dataStoreManager) {
        return null;
    }
    
    /**
     * Retrofit 모듈
     * - Gson 변환 사용. 추후 Moshi로 전환 예정
     *
     * @param okHttpClient
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @PublicAccess()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit providePublicRetrofit(@PublicAccess()
    @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @PrivateAccess()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit providePrivateRetrofit(@PrivateAccess()
    @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    /**
     * Retrofit을 이용한 KameloService 모듈
     *
     * @param retrofit
     * @return
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.network.service.TokenService provideTokenService(@PublicAccess()
    @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.network.service.UserService provideUserService(@PrivateAccess()
    @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kh.my_github.data.network.service.RepoService provideRepoService(@PrivateAccess()
    @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}