package com.gzstudio.taxoterial.data

import com.gzstudio.taxoterial.R

data class Item(
//    val id: Int,
    val type: String,
    val parent: String?,
    val itemImageId: Int = R.drawable.ic_launcher_foreground,
    val name: String,
    val body: String,
    val child: String
)
