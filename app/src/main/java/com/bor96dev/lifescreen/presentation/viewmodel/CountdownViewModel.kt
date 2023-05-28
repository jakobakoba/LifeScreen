package com.bor96dev.lifescreen.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.data.dao.CountdownDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CountdownViewModel(
    private val countdownDao: CountdownDao
) : ViewModel() {
    private val _remainingYears = mutableStateOf(0)
    val remainingYears: State<Int> = _remainingYears

    private val _remainingWeeks = mutableStateOf(0)
    val remainingWeeks: State<Int> = _remainingWeeks

    private val _remainingDays = mutableStateOf(0)
    val remainingDays: State<Int> = _remainingDays

    private var _countdownList = MutableStateFlow<List<Countdown>>(emptyList())
    val countdownList = _countdownList.asStateFlow()

    fun calculateRemainingTime(targetAge: Int) {}


    fun saveCountdown(countdown: Countdown){
        viewModelScope.launch {
            countdownDao.insert(countdown)
        }
    }




}