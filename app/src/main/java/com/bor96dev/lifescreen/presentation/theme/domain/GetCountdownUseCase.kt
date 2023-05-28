package com.bor96dev.lifescreen.presentation.theme.domain

import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.presentation.theme.domain.repository.CountdownRepository

class GetCountdownUseCase(private val countdownRepository: CountdownRepository) {
    suspend operator fun invoke(countdownId: Int): Countdown {
        return countdownRepository.getCountdown(countdownId)
    }
}