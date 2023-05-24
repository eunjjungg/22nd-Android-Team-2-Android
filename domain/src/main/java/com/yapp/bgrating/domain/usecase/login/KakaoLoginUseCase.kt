package com.yapp.bgrating.domain.usecase.login

import com.yapp.bgrating.domain.model.MockApiItem
import com.yapp.bgrating.domain.repository.MockRepository
import javax.inject.Inject

class KakaoLoginUseCase @Inject constructor(
    private val mockRepository: MockRepository,
) {
    suspend fun execute(token: String): MockApiItem? = mockRepository.getKakaoMock(token = token)
}
