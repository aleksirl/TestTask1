package com.bignerdranch.android.testtask1.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bignerdranch.android.testtask1.R

class HomeFragment: Fragment () {
    private lateinit var login: String


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)

        view.findViewById<TextView>(R.id.welcome_logo_text).text = "Welcome $login"

        return view
    }








    companion object {
        fun newInstance(login: String): HomeFragment {
            val fragment = HomeFragment()
            fragment.login = login
            return fragment
        }
    }
}