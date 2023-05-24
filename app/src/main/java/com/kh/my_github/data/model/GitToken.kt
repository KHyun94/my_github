package com.kh.my_github.data.model

import com.google.gson.annotations.SerializedName

/**
 * Git o auth token
 *
 * @property accessToken
 * @property scope
 * @property tokenType
 * @constructor Create empty Git o auth token
 */
data class GitToken(
    @SerializedName("access_token")
    val accessToken: String,
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String,
)
