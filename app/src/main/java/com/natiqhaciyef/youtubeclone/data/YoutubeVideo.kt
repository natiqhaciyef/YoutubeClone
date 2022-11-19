package com.natiqhaciyef.youtubeclone.data

data class YoutubeVideo(
    val id: Int,
    val title: String,
    val videoTimeLong: String,
    val videoPostTime: String,
    val videoImage: String,
    val channelInfo: Channel,
    val views: String
)


