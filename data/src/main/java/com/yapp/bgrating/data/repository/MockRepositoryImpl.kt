package com.yapp.bgrating.data.repository

import com.yapp.bgrating.data.datasource.MockDataSource
import com.yapp.bgrating.data.mapper.MapperToDomain
import com.yapp.bgrating.domain.model.MockApiItem
import com.yapp.bgrating.domain.repository.MockRepository
import com.yapp.bgrating.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class MockRepositoryImpl @Inject constructor(
    private val mockDataSource: MockDataSource,
) : MockRepository {
    override suspend fun getKakaoMock(
        remoteErrorEmitter: RemoteErrorEmitter,
        token: String
    ): MockApiItem? {
        return MapperToDomain.mapperToMockApiItem(
            mockDataSource.getKakaoMock(remoteErrorEmitter, token = token)
        )
    }
}
