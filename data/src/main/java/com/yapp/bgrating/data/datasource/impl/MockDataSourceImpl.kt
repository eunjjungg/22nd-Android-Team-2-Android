package com.yapp.bgrating.data.datasource.impl

import com.yapp.bgrating.data.datasource.MockDataSource
import com.yapp.bgrating.data.model.MockApiResponse
import com.yapp.bgrating.data.remote.OAuthApi
import javax.inject.Inject

class MockDataSourceImpl @Inject constructor(
    private val oauthApi: OAuthApi
) : MockDataSource {
    override suspend fun getKakaoMock(token: String): MockApiResponse? {
        TODO("Not yet implemented")
    }
}
