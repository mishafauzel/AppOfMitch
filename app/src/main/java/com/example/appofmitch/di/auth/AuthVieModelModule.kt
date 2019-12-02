package com.example.appofmitch.di.auth

import androidx.lifecycle.ViewModel
import com.example.appofmitch.di.ViewModelKey
import com.example.appofmitch.ui.auth.AuthViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthVieModelModule
{
    @Binds
    @IntoMap
   @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel):ViewModel
}