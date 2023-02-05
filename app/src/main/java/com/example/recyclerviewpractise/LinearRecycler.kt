package com.example.recyclerviewpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerviewpractise.databinding.LinearActivityBinding
import com.example.recyclerviewpractise.ui.LinearRecycleViewModel
import com.example.recyclerviewpractise.ui.LinearRecycleModelFactory

class LinearRecycler : AppCompatActivity() {
    lateinit var mainBinding: LinearActivityBinding
    lateinit var linearRecycleViewModel: LinearRecycleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = LinearActivityBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        // creating the instance of the viewModel
        linearRecycleViewModel = ViewModelProvider(
            this,
            LinearRecycleModelFactory(applicationContext)
        )[LinearRecycleViewModel::class.java]

        linearRecycleViewModel.setRecyclerView(mainBinding.recyclerView)
    }

    @Deprecated("Deprecated in Java", ReplaceWith("finish()"))
    override fun onBackPressed() {
        finish()
        Log.d("buddy", "onBackPressed: LinearRecyclerActivity --> OnBackPressed")
    }
}