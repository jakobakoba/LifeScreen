package com.bor96dev.lifescreen.domain

import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.domain.repository.CountdownRepository

class GetCountdownUseCase(private val countdownRepository: CountdownRepository) {
    suspend operator fun invoke(countdownId: Int): Countdown {
        return countdownRepository.getCountdown(countdownId)
    }
}