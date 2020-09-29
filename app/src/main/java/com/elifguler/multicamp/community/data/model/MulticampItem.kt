package com.elifguler.multicamp.community.data.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class MulticampItem(
    @SerialName("banner")
    val banner: String,
    @SerialName("description")
    val description: String,
    @SerialName("leader")
    val leader: Leader,
    @SerialName("links")
    val links: Links,
    @SerialName("name")
    val name: String,
): Parcelable