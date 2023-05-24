package com.kh.my_github.data.datasource

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.kh.my_github.data.model.GitRepository
import com.kh.my_github.data.network.service.RepoService
import javax.inject.Inject

class RepoPagingSource @Inject constructor(
    private val repoService: RepoService
) : PagingSource<Int, GitRepository>() {

    private var url: String = ""

    fun setUrl(url: String): RepoPagingSource {
        this.url = url
        return this
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GitRepository> {
        return try {
            val next = params.key ?: 0

            val result = repoService.getRepos(url, next, 10)

            if (result.isSuccessful || result.body()?.isNotEmpty() == true) {
                LoadResult.Page(
                    data = result.body() ?: emptyList(),
                    prevKey = if (next == 0) null else next - 1,
                    nextKey = next + 1
                )
            }

            LoadResult.Error(Exception(result.message()))
        } catch (e: Exception) {
            e.printStackTrace()
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, GitRepository>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}