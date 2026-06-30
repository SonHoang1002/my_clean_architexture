package com.hts.mycleanarchitexture.domain.repository.implementation

import com.hts.mycleanarchitexture.data.datasrc.`interface`.UserDSInterface
import com.hts.mycleanarchitexture.data.remote.UserResponse
import com.hts.mycleanarchitexture.domain.repository.`interface`.UserRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


class UserRepositoryImpl @Inject constructor(
    private val userDSInterface: UserDSInterface,
) : UserRepository {

    override suspend fun getUsers(username: String): Flow<UserResponse> {
        return flow {
            val result = safeApiCall { userDataSource.fetchUserDetails(username) }
            emit(result)

        }.flowOn(dispatchersProvider.io())
    }
}
