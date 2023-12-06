package com.dicoding.tokolaptop

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val name: String,
    val type: String,
    val desc: String,
    val image: String,
    val price: String,
    val condition: String,
    val weight: String,
    val brand: String,
    val releaseDate: String
) : Parcelable