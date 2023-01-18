package com.bignerdranch.android.testtask1.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.testtask1.R
import com.bignerdranch.android.testtask1.domain.User

class MainActivity : AppCompatActivity() {

    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("user", "password")
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, LoginFragment.newInstance(user))
                .commit()
        }
    }
    fun onLoginSuccess(login: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, HomeFragment.newInstance(login))
            .commit()
    }
}