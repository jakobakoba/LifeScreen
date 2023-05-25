package com.bor96dev.lifescreen.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.data.User
import com.bor96dev.lifescreen.domain.GetCountdownUseCase
import com.bor96dev.lifescreen.domain.GetUserUseCase
import kotlinx.coroutines.launch

class UserViewModel(
    private val getUserUseCase: GetUserUseCase,
    private val getCountdownUseCase: GetCountdownUseCase,
) : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    private val _countdown = MutableLiveData<Countdown>()
    val countdown: LiveData<Countdown> = _countdown

    fun getUser(userId: Int) {
        viewModelScope.launch {
            val user = getUserUseCase(userId)
            _user.value = user
        }
    }

    fun getCountdown(countdownId: Int) {
        viewModelScope.launch {
            val countdown = getCountdownUseCase(countdownId)
            _countdown.value = countdown

        }
    }
}