package com.kh.my_github.data.network.service

import com.kh.my_github.data.model.User
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("user")
    suspend fun getUser(): ApiResponse<User>

    //    @GET("users/{username}/repos")
//    fun getRepositories(@Path("username") username: String): ApiResponse<List<RepositoryResponse>>

}