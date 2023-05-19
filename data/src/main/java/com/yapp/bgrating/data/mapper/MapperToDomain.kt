package com.yapp.bgrating.data.mapper

import com.yapp.bgrating.data.model.MockApiResponse
import com.yapp.bgrating.domain.model.MockApiItem

object MapperToDomain {
    // data -> domain
    fun mapperToMockApiItem(response: MockApiResponse?): MockApiItem? {
        return response?.toItem()
    }

    private fun MockApiResponse.toItem(): MockApiItem {
        return MockApiItem(
            this.accessToken,
            this.refreshToken,
        )
    }
}
