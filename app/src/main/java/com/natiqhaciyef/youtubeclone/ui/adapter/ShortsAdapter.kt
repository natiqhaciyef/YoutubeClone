package com.natiqhaciyef.youtubeclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.natiqhaciyef.youtubeclone.R
import com.natiqhaciyef.youtubeclone.data.model.YoutubeShorts
import com.natiqhaciyef.youtubeclone.databinding.RecyclerShortsBinding

class ShortsAdapter(val mContext: Context, val list: List<YoutubeShorts>) :
    RecyclerView.Adapter<ShortsAdapter.ShortsHolder>() {

    inner class ShortsHolder(val binding: RecyclerShortsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortsHolder {
        val binding: RecyclerShortsBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
            R.layout.recycler_shorts, parent, false)
        return ShortsHolder(binding)
    }

    override fun onBindViewHolder(holder: ShortsHolder, position: Int) {
        val itemView = holder.binding
        val short = list[position]

        itemView.short = short
    }

    override fun getItemCount(): Int = list.size
}