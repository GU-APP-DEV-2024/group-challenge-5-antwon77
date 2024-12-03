package com.zybooks.workingwithdata

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MarsPhoto(
    val id: Int,
    val imgSrc: String,
    val roverName: String,
    val cameraName: String,
    val earthDate: String
) : Parcelable
