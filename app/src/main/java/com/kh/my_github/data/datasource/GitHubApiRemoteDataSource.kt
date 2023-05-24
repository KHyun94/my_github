package com.kh.my_github.data.datasource

import com.kh.my_github.data.model.GitRepository
import com.kh.my_github.data.model.User
import com.kh.my_github.data.network.service.RepoService
import com.kh.my_github.data.network.service.UserService
import com.skydoves.sandwich.ApiResponse
import retrofit2.Response
import javax.inject.Inject


class GitHubApiRemoteDataSource @Inject constructor(private val userService: UserService, private val repoService: RepoService) {
    suspend fun getUser(): ApiResponse<User> {
        return userService.getUser()
    }
}