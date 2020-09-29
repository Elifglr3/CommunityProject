package com.elifguler.multicamp.community.data.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Leader(
    val name: String,
    val photo: String
): Parcelable
