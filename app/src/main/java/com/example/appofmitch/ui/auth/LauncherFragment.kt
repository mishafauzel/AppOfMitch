package com.example.appofmitch.ui.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.appofmitch.R
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_launcher.*

/**
 * A simple [Fragment] subclass.
 */
class LauncherFragment : BaseAuthFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        register.setOnClickListener{
            navRegistrtion()
        }
        login.setOnClickListener{
            navLogin()
        }
        forgot_password.setOnClickListener{
            navForgetPassword()
        }
        focusable_view.requestFocus()
    }

    private fun navForgetPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_remindMyPassFragment)
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)
    }

    private fun navRegistrtion() {
        findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_launcher, container, false)
    }


}
