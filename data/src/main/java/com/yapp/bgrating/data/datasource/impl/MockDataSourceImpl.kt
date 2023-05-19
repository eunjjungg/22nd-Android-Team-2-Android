package com.yapp.bgrating.data.datasource.impl

import com.yapp.bgrating.data.datasource.MockDataSource
import com.yapp.bgrating.data.model.MockApiResponse
import javax.inject.Inject

class MockDataSourceImpl @Inject constructor() : MockDataSource {
    override suspend fun getMock(mString: String): MockApiResponse? {
        TODO("Not yet implemented")
    }
}
