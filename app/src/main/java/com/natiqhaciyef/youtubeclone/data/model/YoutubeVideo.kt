package com.natiqhaciyef.youtubeclone.data.model

import java.io.Serializable

data class YoutubeVideo(
    val id: Int,
    val title: String,
    val videoTimeLong: String,
    val videoPostTime: String,
    val videoImage: String,
    val channelInfo: Channel,
    val views: String
): Serializable


