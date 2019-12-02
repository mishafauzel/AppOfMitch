package com.example.appofmitch.di.auth

import com.example.appofmitch.ui.auth.LauncherFragment
import com.example.appofmitch.ui.auth.LoginFragment
import com.example.appofmitch.ui.auth.RegisterFragment
import com.example.appofmitch.ui.auth.RemindMyPassFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class AuthFragmentBuilderModule
{
    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): RemindMyPassFragment
}