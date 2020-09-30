package com.elifguler.multicamp.community.data.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
data class Links(
    val instagram: String,
    val participation: String,
    val twitter: String,
    val youtube: String
): Parcelable
