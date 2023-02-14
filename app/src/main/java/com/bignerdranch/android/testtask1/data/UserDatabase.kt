package com.bignerdranch.android.testtask1.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bignerdranch.android.testtask1.domain.User


@Database (entities = [User::class], version = 1)
abstract class UserDatabase:RoomDatabase() {
    abstract fun userDao(): UserDao
}