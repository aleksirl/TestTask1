package com.bignerdranch.android.testtask1.domain

import androidx.lifecycle.LiveData

interface UserRepository {

    fun addUser (user: User)

    fun deleteUser (user: User)

    fun getUsers():LiveData<List<User>>

    fun loginUser (user: User)

}