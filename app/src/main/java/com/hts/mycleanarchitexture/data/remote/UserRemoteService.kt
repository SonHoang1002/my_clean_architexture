package com.hts.mycleanarchitexture.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface UserRemoteService {
    @GET(ApiPath.USERS)
    suspend fun getUsers(
//        @Path("username") username: String
    ): Response<List<UserResponse>>
}
