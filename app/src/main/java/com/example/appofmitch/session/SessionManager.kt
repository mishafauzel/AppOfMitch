package com.example.appofmitch.session

import android.app.Application
import com.example.appofmitch.persistance.AuthTokenDao
import javax.inject.Inject

class SessionManager
@Inject
constructor(

    val authTokenDao:AuthTokenDao,
    val application: Application

)
{

}