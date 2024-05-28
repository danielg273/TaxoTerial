package com.gzstudio.taxoterial.navigation

import kotlinx.serialization.Serializable

@Serializable
object ScreenDominios

@Serializable
data class ScreenDetails(
    val name: String
)

@Serializable
object ScreenAbout