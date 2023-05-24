package com.kh.my_github.data.network.service

import com.kh.my_github.data.model.GitRepository
import com.skydoves.sandwich.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface RepoService {
    @GET
    suspend fun getRepos(@Url url: String, @Query("page") page: Int, @Query("per_page") perPage: Int): Response<List<GitRepository>>
}