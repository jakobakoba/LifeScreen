package com.bor96dev.lifescreen.presentation.theme.domain.repository

import com.bor96dev.lifescreen.data.User
import com.bor96dev.lifescreen.data.dao.UserDao

class UserRepository(private val userDao: UserDao) {
    suspend fun getUser(userId: Int): User {
        return userDao.getUser(userId)
    }

    suspend fun insertUser(user: User) {
        userDao.insert(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.delete(user)
    }
}