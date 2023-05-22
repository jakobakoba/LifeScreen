package com.bor96dev.lifescreen.di

import android.content.Context
import androidx.room.Room
import com.bor96dev.lifescreen.data.AppDatabase
import com.bor96dev.lifescreen.data.dao.CountdownDao
import com.bor96dev.lifescreen.data.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    fun provideUserDao(db: AppDatabase): UserDao {
        return db.userDao()
    }

    fun provideCountdownDao(db: AppDatabase): CountdownDao {
        return db.countdownDao()
    }
}