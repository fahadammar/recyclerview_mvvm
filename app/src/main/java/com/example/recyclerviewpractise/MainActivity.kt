package com.example.recyclerviewpractise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerviewpractise.databinding.ActivityMainBinding
import com.example.recyclerviewpractise.ui.LinearRecycleViewModel
import com.example.recyclerviewpractise.ui.LinearRecycleModelFactory

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        /**
        The setOnClickListener method is used to register a click listener on the button.
        By passing this as the argument, you are telling the button that the current activity (MainActivity)
        will be the one responsible for handling the click event.
         */
        mainBinding.linearButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            mainBinding.linearButton.id -> {
                moveToLinearActivity()
            }
        }
    }

    private fun moveToLinearActivity() {
        val intent = Intent(this, LinearRecycler::class.java)
        startActivity(intent)
    }
}