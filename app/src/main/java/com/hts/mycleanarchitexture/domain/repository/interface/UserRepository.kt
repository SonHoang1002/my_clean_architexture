package com.hts.mycleanarchitexture.domain.repository.`interface`

import com.hts.mycleanarchitexture.data.remote.UserResponse
import kotlinx.coroutines.flow.Flow


interface UserRepository {
    suspend fun getUsers(): Flow<UserResponse>
}
