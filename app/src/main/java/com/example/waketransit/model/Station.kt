package com.example.waketransit.model

import kotlinx.serialization.Serializable

@Serializable
data class Station(
    val name: String,
    val location: Location
)

@Serializable
data class Location(
    val lat: Double,
    val lng: Double
)
