package com.hts.mycleanarchitexture.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit


@Module
@InstallIn(ActivityComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofitService(): AnalyticsService {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .build()
            .create(AnalyticsService::class.java)
    }
}