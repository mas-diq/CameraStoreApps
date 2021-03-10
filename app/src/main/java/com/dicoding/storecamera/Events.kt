package com.dicoding.storecamera

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Events (
    var image: Int = 0,
    var title: String = "",
    var description: String = "",
    var price: String = "",
) : Parcelable