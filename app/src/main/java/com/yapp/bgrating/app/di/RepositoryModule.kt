package com.yapp.bgrating.app.di

import com.yapp.bgrating.data.datasource.impl.MockDataSourceImpl
import com.yapp.bgrating.data.repository.MockRepositoryImpl
import com.yapp.bgrating.domain.repository.MockRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideMockRepository(
        mockDataSourceImpl: MockDataSourceImpl,
    ): MockRepository {
        return MockRepositoryImpl(
            mockDataSourceImpl,
        )
    }
}
