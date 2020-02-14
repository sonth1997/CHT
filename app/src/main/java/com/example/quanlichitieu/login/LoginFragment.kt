package com.example.quanlichitieu.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quanlichitieu.R
import com.example.quanlichitieu.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLoginGmail.setOnClickListener {
            gotoHome()
        }
        btnLoginFacebook.setOnClickListener {
            gotoHome()
        }
    }
    private fun gotoHome() {
        startActivity(Intent(context, MainActivity::class.java))
        activity?.finish()
    }
}