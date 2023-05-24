package com.kh.my_github.data.network.service;

/**
 * O auth service
 *
 * @constructor Create empty O auth service
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/kh/my_github/data/network/service/TokenService;", "", "getOAuthToken", "Lcom/skydoves/sandwich/ApiResponse;", "Lcom/kh/my_github/data/model/GitToken;", "clientId", "", "clientSecret", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TokenService {
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "login/oauth/access_token")
    @retrofit2.http.Headers(value = {"Accept: application/json"})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOAuthToken(@retrofit2.http.Field(value = "client_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @retrofit2.http.Field(value = "client_secret")
    @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @retrofit2.http.Field(value = "code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.skydoves.sandwich.ApiResponse<com.kh.my_github.data.model.GitToken>> $completion);
}