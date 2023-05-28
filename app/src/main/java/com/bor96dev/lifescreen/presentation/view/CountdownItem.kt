package com.bor96dev.lifescreen.presentation.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bor96dev.lifescreen.data.Countdown

@Composable
fun CountdownItem (countdown: Countdown){
    Text(text = countdown.title)
    Text(text = countdown.remainingTime)

}