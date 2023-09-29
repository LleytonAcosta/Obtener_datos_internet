package com.example.marsphotos.network

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class MarshPhoto (
    val id :String,
    @SerialName(value = "img_src")
    val imgSrc: String

)
