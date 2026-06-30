package com.hts.mycleanarchitexture.data.datasrc.implementation

import com.hts.mycleanarchitexture.data.datasrc.`interface`.UserDSInterface
import com.hts.mycleanarchitexture.data.remote.UserRemoteService
import com.hts.mycleanarchitexture.data.remote.UserResponse
import retrofit2.Response
import javax.inject.Inject


class UserDSRemoteImpl @Inject constructor(private var service: UserRemoteService) :
    UserDSInterface {
    override suspend fun fetchUsers(): Response<List<UserResponse>> {
        return service.getUsers()
    }
}

//https://github.com/samadtalukder/Android-Clean-Architecture-MVVM-With-Compose/blob/master/app/src/main/java/com/samad_talukder/mvvmcompose/di/NetworkModule.kt




