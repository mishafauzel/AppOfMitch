package com.example.appofmitch.repository.auth

import com.example.appofmitch.api.auth.OpenApiAuthService
import com.example.appofmitch.persistance.AccountPropertiesDao
import com.example.appofmitch.persistance.AuthTokenDao
import com.example.appofmitch.session.SessionManager
import javax.inject.Inject

class  AuthRepository
@Inject
constructor(
    val  authTokenDao: AuthTokenDao,
    accountPropertiesDao: AccountPropertiesDao,
    openApiAuthService: OpenApiAuthService,sessionManager: SessionManager
)