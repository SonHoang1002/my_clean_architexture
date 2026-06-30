package com.hts.mycleanarchitexture.data.datasrc.`interface`

import com.hts.mycleanarchitexture.data.remote.UserResponse
import retrofit2.Response

interface UserDSInterface {
    suspend fun fetchUsers(): Response<List<UserResponse>>
}
