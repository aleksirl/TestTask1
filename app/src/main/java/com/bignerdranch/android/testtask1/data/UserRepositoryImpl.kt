package com.bignerdranch.android.testtask1.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.bignerdranch.android.testtask1.domain.User
import com.bignerdranch.android.testtask1.domain.UserRepository


private const val DATABASE_NAME = "user-database"

class UserRepositoryImpl(context: Context): UserRepository {

    private val userBase: UserDatabase = Room.databaseBuilder(
        context.applicationContext,
        UserDatabase::class.java,
        DATABASE_NAME).build()


    override fun addUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun deleteUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun getUsers(): LiveData<List<User>> {
        TODO("Not yet implemented")
    }

    override fun loginUser(user: User) {
        TODO("Not yet implemented")
    }
}