package com.elifguler.multicamp.community.data


import com.elifguler.multicamp.community.data.model.Multicamp
import retrofit2.http.GET

interface CommunityApi {
    @GET("multicamp/communities")
    suspend fun getMulticampCommunities(): Multicamp
}