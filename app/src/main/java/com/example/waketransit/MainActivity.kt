package com.example.waketransit

import MainScreenPreview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.waketransit.ui.component.AppNavigation
import com.example.waketransit.ui.screen.MapScreenPreview
import com.example.waketransit.ui.theme.WakeTransitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WakeTransitTheme {
                AppNavigation()
            }
        }
    }
}
