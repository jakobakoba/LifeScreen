package com.bor96dev.lifescreen.presentation.theme.domain.repository

import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.data.dao.CountdownDao

class CountdownRepository(private val countdownDao: CountdownDao) {
    suspend fun getCountdown(countdownId: Int) : Countdown {
        return countdownDao.getCountdown(countdownId)
    }

    suspend fun insertCountdown(countdown: Countdown){
        countdownDao.insert(countdown)
    }
    suspend fun deleteCountdown(countdown: Countdown){
        countdownDao.delete(countdown)
    }

}