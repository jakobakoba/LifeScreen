package com.bor96dev.lifescreen.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.bor96dev.lifescreen.data.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: User): Long

    @Query("SELECT * FROM User WHERE id = :userId")
    suspend fun getUser(userId: Int): User

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

}