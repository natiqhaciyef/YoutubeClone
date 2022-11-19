package com.natiqhaciyef.youtubeclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.natiqhaciyef.youtubeclone.R
import com.natiqhaciyef.youtubeclone.data.model.YoutubeVideo
import com.natiqhaciyef.youtubeclone.databinding.RecyclerVideosBinding

class VideoAdapter(private val mContext: Context, val list: List<YoutubeVideo>) :
    RecyclerView.Adapter<VideoAdapter.VideoHolder>() {

    inner class VideoHolder(val binding: RecyclerVideosBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
        val binding: RecyclerVideosBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.recycler_videos,
            parent,
            false
        )
        return VideoHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        val video = list[position]
        val itemView = holder.binding
        itemView.video = video

        itemView.videoImageView.setImageResource(
            mContext.resources.getIdentifier(
                video.videoImage,
                "drawable",
                mContext.packageName
            )
        )
        itemView.userProfileImageView.setImageResource(
            mContext.resources.getIdentifier(
                video.channelInfo.image,
                "drawable",
                mContext.packageName
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
