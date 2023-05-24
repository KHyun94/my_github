package com.kh.my_github.data.model

import com.google.gson.annotations.SerializedName

data class GitRepository(
    val id: Int,
    val name: String,
    val owner: User,
    @SerializedName("html_url")
    val htmlUrl: String,
    @SerializedName("stargazers_count")
    val stargazersCount: String,
    val language: String?,
)
