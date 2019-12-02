package com.example.appofmitch.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appofmitch.models.AccountProperties
import com.example.appofmitch.models.AuthToken

@Database(entities = [AccountProperties::class,AuthToken::class],version = 1)
abstract class AppDatabase:RoomDatabase()

{
    abstract fun getAccountPropertiesDao():AccountPropertiesDao
    abstract fun getAuthTokenDao():AuthTokenDao
    companion object
    {

        const val DATABASE_NAME="app_db"
    }
}