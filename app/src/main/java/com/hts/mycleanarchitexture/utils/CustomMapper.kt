package com.hts.mycleanarchitexture.utils

interface CustomMapper<in E, T> {
    fun mapFrom(from: E): T
}