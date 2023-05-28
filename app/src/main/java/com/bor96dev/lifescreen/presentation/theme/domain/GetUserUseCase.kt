package com.bor96dev.lifescreen.presentation.theme.domain

import com.bor96dev.lifescreen.data.User
import com.bor96dev.lifescreen.presentation.theme.domain.repository.UserRepository

class GetUserUseCase (private val userRepository: UserRepository){
    suspend operator fun invoke(userId: Int): User {
        return userRepository.getUser(userId)
    }
}