package com.bignerdranch.android.testtask1.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bignerdranch.android.testtask1.R
import com.bignerdranch.android.testtask1.databinding.HomeFragmentBinding

class HomeFragment: Fragment () {
    private lateinit var login: String
    private lateinit var binding: HomeFragmentBinding


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeFragmentBinding.inflate(layoutInflater, container, false)


        return binding.root
    }








    companion object {
        fun newInstance(login: String): HomeFragment {
            val fragment = HomeFragment()
            fragment.login = login
            return fragment
        }
    }
}