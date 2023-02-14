package com.bignerdranch.android.testtask1.data

import androidx.room.Insert
import androidx.room.Query
import com.bignerdranch.android.testtask1.domain.User

interface UserDao {

    @Insert
    fun insert (user: User)

    @Query("SELECT * FROM User WHERE login = :login AND password = :password")
    fun getUser(login: String, password: String): User
}