package com.example.mybooklist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Book(
    val name: String?,
    val description: String?,
    val photo: Int,
    val date: String?,
    val status: String?,
) : Parcelable
