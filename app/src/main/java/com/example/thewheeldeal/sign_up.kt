package com.example.thewheeldeal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth


class sign_up : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var mAuth: FirebaseAuth? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.Login).setOnClickListener{
            view.findNavController().navigate(R.id.action_sign_up_to_login)
        }
        mAuth=FirebaseAuth.getInstance()

        view.findViewById<Button>(R.id.button5).setOnClickListener{
            view.findNavController().navigate(R.id.action_sign_up_to_landing)
        }

    }


}