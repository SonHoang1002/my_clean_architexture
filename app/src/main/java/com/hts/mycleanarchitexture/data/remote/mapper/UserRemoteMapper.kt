package com.hts.mycleanarchitexture.data.remote.mapper

import com.hts.mycleanarchitexture.data.remote.AddressResponse
import com.hts.mycleanarchitexture.data.remote.CompanyResponse
import com.hts.mycleanarchitexture.data.remote.GeoResponse
import com.hts.mycleanarchitexture.data.remote.UserResponse
import com.hts.mycleanarchitexture.domain.model.AddressEntity
import com.hts.mycleanarchitexture.domain.model.CompanyEntity
import com.hts.mycleanarchitexture.domain.model.GeoEntity
import com.hts.mycleanarchitexture.domain.model.UserEntity
import com.hts.mycleanarchitexture.utils.CustomMapper
import jakarta.inject.Inject

class UserRemoteMapper @Inject constructor() :
    CustomMapper<UserResponse, UserEntity> {
    override fun mapFrom(from: UserResponse): UserEntity {
        return UserEntity(
            id = from.id,
            name = from.name,
            username = from.username,
            email = from.email,
            address = from.address?.let { AddressRemoteMapper().mapFrom(it) },
            phone = from.phone,
            website = from.website,
            company = from.company?.let { CompanyRemoteMapper().mapFrom(it) },
        )
    }
}

class AddressRemoteMapper @Inject constructor() :
    CustomMapper<AddressResponse, AddressEntity> {
    override fun mapFrom(from: AddressResponse): AddressEntity {
        return AddressEntity(
            street = from.street,
            suite = from.suite,
            city = from.city,
            zipcode = from.zipcode,
            geo = from.geo?.let { GeoRemoteMapper().mapFrom(it) }
        )
    }
}

class GeoRemoteMapper @Inject constructor() :
    CustomMapper<GeoResponse, GeoEntity> {
    override fun mapFrom(from: GeoResponse): GeoEntity {
        return GeoEntity(
            lat = from.lat,
            lng = from.lng
        )
    }
}

class CompanyRemoteMapper @Inject constructor() :
    CustomMapper<CompanyResponse, CompanyEntity> {
    override fun mapFrom(from: CompanyResponse): CompanyEntity {
        return CompanyEntity(
            name = from.name,
            catchPhrase = from.catchPhrase,
            bs = from.bs
        )
    }
}
