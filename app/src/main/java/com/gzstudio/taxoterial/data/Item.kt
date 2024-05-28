package com.gzstudio.taxoterial.data

data class Item(
//    val id: Int,
    val type: String,
    val parent: String?,
    val itemImageId: Int?,
    val name: String,
    val body: String,
    val child: String
)
