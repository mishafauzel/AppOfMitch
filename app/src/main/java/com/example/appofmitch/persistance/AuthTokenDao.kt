package com.example.appofmitch.persistance

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.appofmitch.models.AuthToken

@Dao
interface AuthTokenDao
{
    @Insert(onConflict = REPLACE)
    fun insert(authToken: AuthToken):Long

    @Query("UPDATE auth_token SET token=null WHERE account_pk=:pk")
    fun nullifyToken(pk:Int):Int
}