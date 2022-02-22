package com.example.thewheeldeal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController


class NextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            view.findNavController().navigate(R.id.action_nextFragment2_to_sign_up)
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            view.findNavController().navigate(R.id.action_nextFragment2_to_login)
        }
    }


}