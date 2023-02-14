package com.bignerdranch.android.testtask1.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bignerdranch.android.testtask1.R
import com.bignerdranch.android.testtask1.databinding.LoginFragmentBinding

import com.bignerdranch.android.testtask1.domain.User



class LoginFragment: Fragment() {
    private lateinit var user: User
    private lateinit var binding: LoginFragmentBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(layoutInflater, container, false)

        val loginButton = binding.loginButton
        val loginEditText = binding.loginTitle
        val passwordEditText = binding.passwordTitle
        val regButton = binding.loginButtonReg

        val user = User("user","password")


        regButton.setOnClickListener{
            findNavController().navigate(R.id.regFragment)
        }

        loginButton.setOnClickListener {
            val login = loginEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (login == user.login && password == user.password) {
                findNavController().navigate(R.id.homeFragment)
            } else {
                Toast.makeText(activity, "Incorrect login or password", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    companion object {
        fun newInstance(user: User): LoginFragment {
            val fragment = LoginFragment()
            fragment.user = user
            return fragment
        }
    }
}