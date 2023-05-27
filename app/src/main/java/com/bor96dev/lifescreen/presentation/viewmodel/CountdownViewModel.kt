package com.bor96dev.lifescreen.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountdownViewModel : ViewModel() {
    private val _remainingYears = mutableStateOf(0)
    val remainingYears: State<Int> = _remainingYears

    private val _remainingWeeks = mutableStateOf(0)
    val remainingWeeks: State<Int> = _remainingWeeks

    private val _remainingDays = mutableStateOf(0)
    val remainingDays: State<Int> = _remainingDays

    fun calculateRemainingTime(targetAge: Int) {}


}