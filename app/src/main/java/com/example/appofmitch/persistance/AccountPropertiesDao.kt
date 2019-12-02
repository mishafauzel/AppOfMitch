package com.example.appofmitch.persistance

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.appofmitch.models.AccountProperties

@Dao
interface AccountPropertiesDao
{

    @Insert(onConflict = REPLACE)
    fun insertAndReplase(accountProperties: AccountProperties):Long

    @Insert(onConflict = IGNORE)
    fun insertOrIgnore(accountProperties: AccountProperties):Long

    @Query("SELECT * FROM account_table WHERE pk = :pk")
    fun selectByPk(pk:Int):AccountProperties?

    @Query("SELECT * FROM account_table WHERE email = :email")
    fun selectByPk(email:String):AccountProperties?
}