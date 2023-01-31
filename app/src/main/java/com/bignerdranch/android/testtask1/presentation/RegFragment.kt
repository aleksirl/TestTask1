package com.bignerdranch.android.testtask1.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.testtask1.databinding.RegFragmentBinding
import com.bignerdranch.android.testtask1.domain.User

class RegFragment: Fragment() {
    private lateinit var user: User
    private lateinit var binding: RegFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegFragmentBinding.inflate(layoutInflater,container,false)

        return binding.root
    }
}