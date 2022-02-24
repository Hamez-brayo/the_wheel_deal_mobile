package com.example.thewheeldeal

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


// [START declare_auth]
private lateinit var auth: FirebaseAuth
// [END declare_auth]
class sign_up : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var mAuth: FirebaseAuth? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.Login).setOnClickListener{
            view.findNavController().navigate(R.id.action_sign_up_to_login)
        }
        mAuth=FirebaseAuth.getInstance()

        view.findViewById<Button>(R.id.button5).setOnClickListener{
            view.findNavController().navigate(R.id.action_sign_up_to_landing)
        }

    }
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // [START initialize_auth]
        // Initialize Firebase Auth
        auth = Firebase.auth
        // [END initialize_auth]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }
    private fun createAccount(firstName: String, LastName:String, IDNO: Int, email: String, contact: Int, password: String, ) {
        // [START create_user_with_email]
        auth.createUserWithEmailAndPassword( email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(requireContext(), "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
        // [END create_user_with_email]
    }


    companion object {
        private const val TAG = "EmailPassword"
    }
    private fun updateUI(user: FirebaseUser?) {

    }


}