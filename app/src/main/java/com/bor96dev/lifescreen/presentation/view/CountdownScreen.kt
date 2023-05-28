package com.bor96dev.lifescreen.presentation.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.bor96dev.lifescreen.data.Countdown
import com.bor96dev.lifescreen.presentation.viewmodel.CountdownViewModel
import com.bor96dev.lifescreen.presentation.viewmodel.UserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountdownScreen() {

    val countdownList = remember { mutableStateListOf<Countdown>() }

    Column() {
        
        LazyColumn {
            items(countdownList) { countdown ->
                CountdownItem(countdown = countdown)
            }
        }

        val nameTextFieldState = remember { mutableStateOf("") }
        val timeTextFieldState = remember { mutableStateOf("") }


        TextField(value = nameTextFieldState.value,
            onValueChange = { nameTextFieldState.value = it },
            label = { Text("Timer Name") })

        TextField(value = timeTextFieldState.value,
            onValueChange = { timeTextFieldState.value = it },
            label = { Text("Remaining Time") })

        Button(onClick = {
            val countdown = Countdown(
                id = 0,
                title = nameTextFieldState.value,
                remainingTime = timeTextFieldState.value
            )
            countdownList.add(countdown)
            nameTextFieldState.value = ""
            timeTextFieldState.value = ""

        }) {
            Text("Add Countdown")
        }
    }

}



