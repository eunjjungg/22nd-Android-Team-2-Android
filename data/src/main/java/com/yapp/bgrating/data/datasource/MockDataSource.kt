package com.yapp.bgrating.data.datasource

import com.yapp.bgrating.data.model.MockApiResponse

interface MockDataSource {
    suspend fun getMock(mString: String): MockApiResponse?
}
