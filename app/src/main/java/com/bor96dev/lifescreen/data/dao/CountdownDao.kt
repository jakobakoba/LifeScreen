package com.bor96dev.lifescreen.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.bor96dev.lifescreen.data.Countdown

@Dao
interface CountdownDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(countdown: Countdown) : Long

    @Query("SELECT * FROM Countdown WHERE userId = :userId")
    suspend fun getCountdownsForUser(userId: Int): List<Countdown>

    @Update
    suspend fun update(countdown: Countdown)

    @Delete
    suspend fun delete(countdown: Countdown)

}