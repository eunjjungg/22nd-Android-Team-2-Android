package com.yapp.bgrating.data.datasource

import com.yapp.bgrating.data.model.MockApiResponse

interface MockDataSource {
    suspend fun getKakaoMock(token: String): MockApiResponse?
}
