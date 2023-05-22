package com.bor96dev.lifescreen.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bor96dev.lifescreen.data.dao.CountdownDao
import com.bor96dev.lifescreen.data.dao.UserDao

@Database(entities = [User::class, Countdown::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun countdownDao(): CountdownDao
}