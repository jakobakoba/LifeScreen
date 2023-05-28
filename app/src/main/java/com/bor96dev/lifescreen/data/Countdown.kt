package com.bor96dev.lifescreen.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Countdown(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val remainingTime: String
)