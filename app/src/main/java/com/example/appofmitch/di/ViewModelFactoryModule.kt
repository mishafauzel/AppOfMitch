package com.example.appofmitch.di

import androidx.lifecycle.ViewModelProvider
import com.example.appofmitch.viewmodels.ViewModelsFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule
{
    @Binds
    abstract fun bindViewModelFactory(modleFactory:ViewModelsFactory):ViewModelProvider.Factory
}