package com.kh.my_github.data.network;

/**
 * API 요청 시, 사전 처리 부분
 * - 저장된 Token 여부에 따라 토큰 값을 헤더에 담아 보낸다.
 *
 * @property dataStoreManager
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kh/my_github/data/network/RequestInterceptor;", "Lokhttp3/Interceptor;", "dataStoreManager", "Lcom/kh/my_github/data/db/DataStoreManager;", "(Lcom/kh/my_github/data/db/DataStoreManager;)V", "getToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class RequestInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final com.kh.my_github.data.db.DataStoreManager dataStoreManager = null;
    
    public RequestInterceptor(@org.jetbrains.annotations.NotNull()
    com.kh.my_github.data.db.DataStoreManager dataStoreManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    /**
     * DataStore에서 토큰을 가져온다
     *
     * @return
     */
    private final java.lang.Object getToken(kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
}