package com.kh.my_github.data.network

import com.kh.my_github.data.db.DataStoreKeys
import com.kh.my_github.data.db.DataStoreManager
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Response

/**
 * API 요청 시, 사전 처리 부분
 * - 저장된 Token 여부에 따라 토큰 값을 헤더에 담아 보낸다.
 *
 * @property dataStoreManager
 */
class RequestInterceptor (private val dataStoreManager: DataStoreManager) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response = with(chain) {
        val original = chain.request()
        var token: String?
        runBlocking {
            token = getToken()
            if (!token.isNullOrEmpty()) {
                val authorized = original.newBuilder()
                    .addHeader("Authorization", "Bearer $token")
                    .build()
                chain.proceed(authorized)
            } else {
                chain.proceed(original)
            }
        }

    }

    /**
     * DataStore에서 토큰을 가져온다
     *
     * @return
     */
    private suspend fun getToken() =
        dataStoreManager.readValue(DataStoreKeys.TOKEN)
}