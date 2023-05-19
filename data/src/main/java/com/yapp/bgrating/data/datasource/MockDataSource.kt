package com.yapp.bgrating.data.datasource

import com.yapp.bgrating.data.model.MockApiResponse
import com.yapp.bgrating.domain.utils.RemoteErrorEmitter

interface MockDataSource {
    suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiResponse?
}
