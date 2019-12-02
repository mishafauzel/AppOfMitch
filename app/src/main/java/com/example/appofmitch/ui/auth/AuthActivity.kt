package com.example.appofmitch.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appofmitch.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
