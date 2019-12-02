package com.example.appofmitch.ui.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.appofmitch.R
import com.example.appofmitch.viewmodels.ViewModelsFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
abstract class BaseAuthFragment : DaggerFragment() {

    @Inject
    lateinit var providerFactory:ViewModelsFactory

    lateinit var viewModel:AuthViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=activity?.run {
            ViewModelProviders.of(this,providerFactory).get(AuthViewModel::class.java)
        }?:throw Exception("Invalid Activity")
    }
}
