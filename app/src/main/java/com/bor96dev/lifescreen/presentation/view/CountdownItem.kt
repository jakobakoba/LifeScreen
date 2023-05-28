package com.bor96dev.lifescreen.presentation.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bor96dev.lifescreen.data.Countdown

@Composable
fun CountdownItem (countdown: Countdown){
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()) {

        Text(text = countdown.title)
        Text(text = countdown.remainingTime)

    }


}