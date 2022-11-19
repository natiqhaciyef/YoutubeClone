package com.natiqhaciyef.youtubeclone.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.natiqhaciyef.youtubeclone.R
import com.natiqhaciyef.youtubeclone.databinding.FragmentSubscriptionsBinding


class SubscriptionsFragment : Fragment() {
    private lateinit var binding: FragmentSubscriptionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentSubscriptionsBinding.inflate(inflater, container, false)


        return binding.root
    }
}