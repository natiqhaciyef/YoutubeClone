package com.natiqhaciyef.youtubeclone.data.model

import java.io.Serializable

data class YoutubeShorts(
    val id: Int,
    val channel: Channel,
    val likeCount: String = "0",
    val commentCount: String = "0",
    val name: String
): Serializable