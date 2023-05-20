package com.yapp.bgrating.data.remote

import com.yapp.bgrating.data.model.MockApiRequest
import com.yapp.bgrating.data.model.MockApiResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface OAuthApi {
    @POST("auth/login")
    suspend fun postMockApi(
        @Body mockApiRequest: MockApiRequest,
    ): Response<MockApiResponse>
}
