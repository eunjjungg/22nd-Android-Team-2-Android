package com.yapp.bgrating.domain.repository

import com.yapp.bgrating.domain.model.MockApiItem
import com.yapp.bgrating.domain.utils.RemoteErrorEmitter

interface MockRepository {
    suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiItem?
}
