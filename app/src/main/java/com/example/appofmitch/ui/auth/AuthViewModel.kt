package com.example.appofmitch.ui.auth

import androidx.lifecycle.ViewModel
import com.example.appofmitch.repository.auth.AuthRepository
import javax.inject.Inject

class  AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
):ViewModel()