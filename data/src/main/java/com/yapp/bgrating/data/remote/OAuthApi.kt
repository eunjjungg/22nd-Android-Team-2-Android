package com.yapp.bgrating.data.remote

import com.yapp.bgrating.data.model.MockApiResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.POST

interface OAuthApi {
    @POST("auth/login")
    suspend fun postMockApi(
        @Field("type") type: String,
        @Field("token") token: String,
    ): Response<MockApiResponse>
}
