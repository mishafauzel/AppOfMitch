package com.example.appofmitch.di

import com.example.appofmitch.di.auth.AuthFragmentBuilderModule
import com.example.appofmitch.di.auth.AuthModule
import com.example.appofmitch.di.auth.AuthScope
import com.example.appofmitch.di.auth.AuthVieModelModule
import com.example.appofmitch.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class ActivityBuilderModule
{
    @AuthScope
    @ContributesAndroidInjector(modules = [AuthModule::class, AuthFragmentBuilderModule::class, AuthVieModelModule::class])
    abstract fun contributeAuthActivity():AuthActivity
}
