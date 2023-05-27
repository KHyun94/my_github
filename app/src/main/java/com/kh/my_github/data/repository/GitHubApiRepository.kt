package com.kh.my_github.data.repository

import android.util.Log
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.kh.my_github.data.datasource.GitHubApiRemoteDataSource
import com.kh.my_github.data.datasource.RepoPagingSource
import com.kh.my_github.data.model.GitRepository
import com.kh.my_github.data.model.User
import com.skydoves.sandwich.onFailure
import com.skydoves.sandwich.suspendOnSuccess
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class GitHubApiRepository @Inject constructor(
    private val gitHubApiRemoteDataSource: GitHubApiRemoteDataSource,
    private val repoPagingSource: RepoPagingSource
) {
    fun getUser(onStart: () -> Unit, onCompletion: () -> Unit, onFailed: ()-> Unit): Flow<User> {
        return flow {
            gitHubApiRemoteDataSource.getUser().suspendOnSuccess {
                emit(data)
            }
                .onFailure {
                    Log.e("TAG", "Failed get user")
                    onFailed.invoke()
                }
        }.onStart { onStart.invoke() }
            .onCompletion {
                onCompletion.invoke()
            }
            .flowOn(Dispatchers.IO)

    }

    fun getMyReposByPage(url: String): Pager<Int, GitRepository> {
        return Pager(PagingConfig(pageSize = 10)) {
            return@Pager repoPagingSource.setUrl(url)
        }
    }
}