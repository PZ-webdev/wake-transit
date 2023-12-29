package com.example.waketransit.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen(navController: NavController) {
    val uiSettings: MapUiSettings by remember { mutableStateOf(MapUiSettings()) }
    val properties by remember { mutableStateOf(MapProperties(mapType = MapType.NORMAL)) }
    val location = LatLng(50.0295, 22.0067) // Rzeszów główny
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(location, 6f)
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SearchField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onValueChange = { /* Handle search query change here */ }
        )

        GoogleMap(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.9f),
            properties = properties,
            uiSettings = uiSettings,
            cameraPositionState = cameraPositionState
        )
    }
}

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }

    BasicTextField(
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        modifier = modifier
            .background(Color.White)
            .border(1.dp, Color.Gray, shape = RoundedCornerShape(4.dp))
            .padding(8.dp)
    )
}

@Composable
@Preview
fun MapScreenPreview() {
    val navController = rememberNavController()
    MapScreen(navController = navController)
}
