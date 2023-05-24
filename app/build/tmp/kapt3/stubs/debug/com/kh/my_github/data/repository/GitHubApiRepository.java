package com.kh.my_github.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/kh/my_github/data/repository/GitHubApiRepository;", "", "gitHubApiRemoteDataSource", "Lcom/kh/my_github/data/datasource/GitHubApiRemoteDataSource;", "repoPagingSource", "Lcom/kh/my_github/data/datasource/RepoPagingSource;", "(Lcom/kh/my_github/data/datasource/GitHubApiRemoteDataSource;Lcom/kh/my_github/data/datasource/RepoPagingSource;)V", "getMyReposByPage", "Landroidx/paging/Pager;", "", "Lcom/kh/my_github/data/model/GitRepository;", "url", "", "getUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kh/my_github/data/model/User;", "onStart", "Lkotlin/Function0;", "", "onCompletion", "onFailed", "app_debug"})
public final class GitHubApiRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.datasource.GitHubApiRemoteDataSource gitHubApiRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.datasource.RepoPagingSource repoPagingSource = null;
    
    @javax.inject.Inject()
    public GitHubApiRepository(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.GitHubApiRemoteDataSource gitHubApiRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.datasource.RepoPagingSource repoPagingSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.kh.my_github.data.model.User> getUser(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onStart, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCompletion, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.Pager<java.lang.Integer, com.kh.my_github.data.model.GitRepository> getMyReposByPage(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
}