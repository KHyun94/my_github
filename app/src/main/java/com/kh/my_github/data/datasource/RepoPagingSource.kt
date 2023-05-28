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

    val REPO_PER_PAGE = 10

    fun setUrl(url: String): RepoPagingSource {
        this.url = url
        Log.d("TAG", "setUrl($url)")
        return this
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GitRepository> {
        try {
            val next = params.key ?: 0

            val result = repoService.getRepos(url, next, REPO_PER_PAGE)

            val list = result.body() ?: emptyList()

            if (!result.isSuccessful || list.isEmpty()) {
                return LoadResult.Error(Exception(result.message()))
            }

            return LoadResult.Page(
                data = list,
                prevKey = if (next == 0) null else next - 1,
                nextKey = next + 1
            )
        } catch (e: Exception) {
            e.printStackTrace()
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, GitRepository>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}

fun main() {

}