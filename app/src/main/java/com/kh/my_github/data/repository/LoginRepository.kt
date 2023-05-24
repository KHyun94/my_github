package com.kh.my_github.data.repository

import android.util.Log
import com.kh.my_github.data.datasource.TokenRemoteDataSource
import com.kh.my_github.data.db.DataStoreKeys
import com.kh.my_github.data.db.DataStoreManager
import com.kh.my_github.data.model.GitToken
import com.skydoves.sandwich.suspendOnSuccess
import com.skydoves.sandwich.onFailure
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val tokenRemoteDataSource: TokenRemoteDataSource,
    private val dataStoreManager: DataStoreManager
) {
    fun login(code: String, onStart: () -> Unit, onCompletion: () -> Unit): Flow<GitToken> {
        return flow {
            tokenRemoteDataSource.getOAuthToken(code = code).suspendOnSuccess {
                dataStoreManager.storeValue(DataStoreKeys.TOKEN, data.accessToken)
                emit(data)
            }
                .onFailure {
                    Log.e("TAG", "Failed Login")
                }
        }.onStart { onStart.invoke() }
            .onCompletion {
                onCompletion.invoke() }
            .flowOn(Dispatchers.IO)

    }


}