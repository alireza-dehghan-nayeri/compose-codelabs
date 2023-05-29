package com.example.basicstatecodelab.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.basicstatecodelab.ui.view.model.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}

