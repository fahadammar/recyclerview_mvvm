package com.example.recyclerviewpractise.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractise.RecyclerAdapter
import com.example.recyclerviewpractise.model.RecyclerRepository

class MainViewModel(private val context: Context) : ViewModel() {
    fun setRecyclerView(recyclerView: RecyclerView) {
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = RecyclerAdapter(context, RecyclerRepository.getInfo())
    }
}