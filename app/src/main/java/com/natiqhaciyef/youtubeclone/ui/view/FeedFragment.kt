package com.natiqhaciyef.youtubeclone.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.natiqhaciyef.youtubeclone.databinding.FragmentFeedBinding
import com.natiqhaciyef.youtubeclone.data.Category
import com.natiqhaciyef.youtubeclone.data.Channel
import com.natiqhaciyef.youtubeclone.data.YoutubeVideo
import com.natiqhaciyef.youtubeclone.ui.adapter.CategoriesAdapter
import com.natiqhaciyef.youtubeclone.ui.adapter.VideoAdapter

class FeedFragment : Fragment() {
    private lateinit var binding: FragmentFeedBinding
    private val categories = arrayListOf(
        Category(image = "youtube_compas",name = "Explore"),
        Category(name = "All"),
        Category(name = "Music"),
        Category(name = "Basketball"),
        Category(name = "Android Development"),
        Category(name = "Gaming"),
        Category(name = "Live"),
        Category(name = "Movies"),
    )
    private val videos = arrayListOf(
        YoutubeVideo(id = 1,"AMERİKA'NIN EN AKIL-ALMAZ 5 YASASI! ŞAKA GİBİ…",
            "6:49","9 days ago","amerikali_aynasiz_video", Channel("Amerikali Aynasiz","amerikali_aynasiz"),"39k"),
        YoutubeVideo(id = 2, "Android Dev Summit '22: Platform Track Livestream", "5:14:41","4 days ago",
            "android_dev_summit",Channel("Android Developers","android_developers"),"8.7k"),
        YoutubeVideo(id = 3 , "Android MVVM Kotlin Tutorial - LiveData + ViewModel (Android Architecture Components)",
        "35:53","4 years ago","mvvm",Channel("Reso Coder","reso_coder"),"103k"),
        YoutubeVideo(id = 4 , "Top 10 Boston Celtics Plays of The Year!", "3:52",
            "1 years ago","boston_celtic",Channel("NBA","nba"),"19.4M"),
        YoutubeVideo(id = 5 , "Amerika’ya gelmenin ve kalmanın yolları", "17:17",
            "9 months ago","aslan_osman_video",Channel("Aslan Osman","aslan_osman"),"99k"),
        YoutubeVideo(id = 6 , "James Harden's 2017-2018 NBA MVP Mixtape", "5:25",
            "4 years ago","james_harden",Channel("NBA","nba"),"1.3M"),
        YoutubeVideo(id = 7 , "How to Build a Simple Video Player With Jetpack Compose & ExoPlayer (Media3)",
            "33:54", "1 months ago","jetpack_compose",Channel("Philipp Lackner","philip_lackner"),"7k")
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)

        binding.categoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.categoriesRecyclerView.adapter = CategoriesAdapter(requireContext(), categories)

        binding.videosRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.videosRecyclerView.adapter = VideoAdapter(requireContext(), videos)
        return binding.root
    }
}