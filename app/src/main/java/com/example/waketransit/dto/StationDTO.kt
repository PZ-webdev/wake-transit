package com.example.waketransit.dto

import android.content.Context
import com.example.waketransit.model.Station
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun getAllStations(context: Context): List<Station> {
    val inputStream = context.assets.open("database/stations.json")
    val json = Json { this.ignoreUnknownKeys = true }
    return json.decodeFromString(inputStream.reader().readText())
}
