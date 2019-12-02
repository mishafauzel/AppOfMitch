package com.example.appofmitch.ui.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.appofmitch.R
import dagger.android.support.DaggerFragment

/**
 * A simple [Fragment] subclass.
 */
class RemindMyPassFragment : BaseAuthFragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remind_my_pass, container, false)
    }


}
