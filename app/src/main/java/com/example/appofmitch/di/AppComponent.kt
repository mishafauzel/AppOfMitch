package com.example.appofmitch.di

import android.app.Application
import com.example.appofmitch.BaseApplication
import com.example.appofmitch.session.SessionManager
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ActivityBuilderModule::class,ViewModelFactoryModule::class])

interface AppComponent :AndroidInjector<BaseApplication>
{
    val sessionManager:SessionManager
    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application: Application):Builder

        fun build():AppComponent
    }
}
