package com.natiqhaciyef.youtubeclone.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.natiqhaciyef.youtubeclone.R
import com.natiqhaciyef.youtubeclone.data.model.Channel
import com.natiqhaciyef.youtubeclone.data.model.YoutubeShorts
import com.natiqhaciyef.youtubeclone.databinding.FragmentShortsBinding
import com.natiqhaciyef.youtubeclone.ui.adapter.ShortsAdapter
import kotlinx.android.synthetic.main.activity_main.*


class ShortsFragment : Fragment() {
    private lateinit var binding: FragmentShortsBinding
    private val list = arrayListOf(
        YoutubeShorts(id = 1, "youtube_shorts_philip_lackner" ,channel = Channel("Philipp Lackner","philip_lackner"),
            likeCount = "27k", commentCount = "13",name = "Philipp Lackner Shorts")
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shorts ,container, false)

        binding.shortsFragment = this
        binding.adapter = ShortsAdapter(requireContext(), list)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.bottomNavigationView!!.visibility = View.GONE
    }
}