package com.kh.my_github.data.datasource;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/kh/my_github/data/datasource/GitHubApiRemoteDataSource;", "", "userService", "Lcom/kh/my_github/data/network/service/UserService;", "repoService", "Lcom/kh/my_github/data/network/service/RepoService;", "(Lcom/kh/my_github/data/network/service/UserService;Lcom/kh/my_github/data/network/service/RepoService;)V", "getUser", "Lcom/skydoves/sandwich/ApiResponse;", "Lcom/kh/my_github/data/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GitHubApiRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.network.service.UserService userService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.network.service.RepoService repoService = null;
    
    @javax.inject.Inject()
    public GitHubApiRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.UserService userService, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.network.service.RepoService repoService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.skydoves.sandwich.ApiResponse<com.kh.my_github.data.model.User>> $completion) {
        return null;
    }
}