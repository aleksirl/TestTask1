package com.bignerdranch.android.testtask1.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bignerdranch.android.testtask1.R

import com.bignerdranch.android.testtask1.domain.User



class LoginFragment: Fragment() {
    private lateinit var user: User

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.login_fragment, container, false)

        val loginButton = view.findViewById<Button>(R.id.login_button)
        val loginEditText = view.findViewById<EditText>(R.id.login_title)
        val passwordEditText = view.findViewById<EditText>(R.id.password_title)

        loginButton.setOnClickListener {
            val login = loginEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (login == user.login && password == user.password) {
                (activity as MainActivity).onLoginSuccess(login)
            } else {
                Toast.makeText(activity, "Incorrect login or password", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    companion object {
        fun newInstance(user: User): LoginFragment {
            val fragment = LoginFragment()
            fragment.user = user
            return fragment
        }
    }
}