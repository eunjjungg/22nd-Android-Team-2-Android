package com.yapp.bgrating.domain.repository

import com.yapp.bgrating.domain.model.MockApiItem

interface MockRepository {
    suspend fun getKakaoMock(token: String): MockApiItem?
}
