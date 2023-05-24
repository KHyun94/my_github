package com.kh.my_github.data.datasource

import android.util.Log
import com.kh.my_github.BuildConfig
import com.kh.my_github.data.model.GitToken
import com.kh.my_github.data.network.service.TokenService
import com.skydoves.sandwich.ApiResponse
import javax.inject.Inject

/**
 * O auth remote data source
 *
 * @property tokenService
 * @constructor Create empty O auth remote data source
 */
class TokenRemoteDataSource @Inject constructor(private val tokenService: TokenService) {
    /**
     * Get o auth token
     *
     * @param code
     * @return
     */
    suspend fun getOAuthToken(code: String): ApiResponse<GitToken> {
        Log.d("TAG", "RDataSource => $code")
        return tokenService.getOAuthToken(
            clientId = BuildConfig.CLIENT_ID,
            clientSecret = BuildConfig.CLIENT_PASSWORD,
            code = code
        )
    }
}