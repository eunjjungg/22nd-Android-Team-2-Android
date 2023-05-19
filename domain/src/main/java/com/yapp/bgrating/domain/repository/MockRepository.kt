package com.yapp.bgrating.domain.repository

import com.yapp.bgrating.domain.model.MockApiResponse

interface MockRepository {
    suspend fun getKakaoMock(token: String): MockApiResponse?
}
