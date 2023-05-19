package com.yapp.bgrating.app.di

import com.yapp.bgrating.data.datasource.MockDataSource
import com.yapp.bgrating.data.datasource.impl.MockDataSourceImpl
import com.yapp.bgrating.data.remote.OAuthApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {
    @Provides
    @Singleton
    fun provideMockDataSource(
        oauthApi: OAuthApi,
    ): MockDataSource {
        return MockDataSourceImpl(oauthApi)
    }
}
