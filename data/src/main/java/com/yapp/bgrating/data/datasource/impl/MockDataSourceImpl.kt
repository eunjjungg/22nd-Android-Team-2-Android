package com.yapp.bgrating.data.datasource.impl

import com.yapp.bgrating.data.datasource.MockDataSource
import com.yapp.bgrating.data.model.MockApiRequest
import com.yapp.bgrating.data.model.MockApiResponse
import com.yapp.bgrating.data.model.MockType
import com.yapp.bgrating.data.remote.OAuthApi
import com.yapp.bgrating.data.utils.BaseRepository
import com.yapp.bgrating.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class MockDataSourceImpl @Inject constructor(
    private val oauthApi: OAuthApi,
) : BaseRepository(), MockDataSource {
    override suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiResponse? {
        return safeApiCall(remoteErrorEmitter) {
            oauthApi.postMockApi(MockApiRequest(MockType.KAKAO, "SUCCESSid")).body()
        }
    }
}
