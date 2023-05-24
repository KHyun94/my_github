package com.kh.my_github.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kh/my_github/data/repository/LoginRepository;", "", "tokenRemoteDataSource", "Lcom/kh/my_github/data/datasource/TokenRemoteDataSource;", "dataStoreManager", "Lcom/kh/my_github/data/db/DataStoreManager;", "(Lcom/kh/my_github/data/datasource/TokenRemoteDataSource;Lcom/kh/my_github/data/db/DataStoreManager;)V", "login", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kh/my_github/data/model/GitToken;", "code", "", "onStart", "Lkotlin/Function0;", "", "onCompletion", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.datasource.TokenRemoteDataSource tokenRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.db.DataStoreManager dataStoreManager = null;
    
    @javax.inject.Inject()
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.TokenRemoteDataSource tokenRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.db.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.kh.my_github.data.model.GitToken> login(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onStart, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCompletion) {
        return null;
    }
}