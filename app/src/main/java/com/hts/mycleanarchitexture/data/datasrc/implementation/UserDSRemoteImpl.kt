package com.hts.mycleanarchitexture.data.datasrc.implementation

import retrofit2.Response
import javax.inject.Inject


class UserDSRemoteImpl @Inject constructor(private var api: GithubApiService) :
    GithubUserDataSource {
    override suspend fun fetchUserDetails(username: String): Response<GitHubUserDetailResponse> {
        return api.getUserDetail(username)
    }
}

//https://github.com/samadtalukder/Android-Clean-Architecture-MVVM-With-Compose/blob/master/app/src/main/java/com/samad_talukder/mvvmcompose/di/NetworkModule.kt