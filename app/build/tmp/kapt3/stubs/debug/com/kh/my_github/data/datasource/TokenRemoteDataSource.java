package com.kh.my_github.data.datasource;

/**
 * O auth remote data source
 *
 * @property tokenService
 * @constructor Create empty O auth remote data source
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/kh/my_github/data/datasource/TokenRemoteDataSource;", "", "tokenService", "Lcom/kh/my_github/data/network/service/TokenService;", "(Lcom/kh/my_github/data/network/service/TokenService;)V", "getOAuthToken", "Lcom/skydoves/sandwich/ApiResponse;", "Lcom/kh/my_github/data/model/GitToken;", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TokenRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.network.service.TokenService tokenService = null;
    
    @javax.inject.Inject()
    public TokenRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.TokenService tokenService) {
        super();
    }
    
    /**
     * Get o auth token
     *
     * @param code
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.skydoves.sandwich.ApiResponse<com.kh.my_github.data.model.GitToken>> $completion) {
        return null;
    }
}