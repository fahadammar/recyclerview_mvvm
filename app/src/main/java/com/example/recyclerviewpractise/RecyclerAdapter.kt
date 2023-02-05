package com.example.recyclerviewpractise

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractise.databinding.RecyclerLayoutBinding
import com.example.recyclerviewpractise.model.InfoModel

class RecyclerAdapter(private val context: Context, private val infoModel: ArrayList<InfoModel>) :
    RecyclerView.Adapter<RecyclerAdapter.recyclerAdapterViewholder>() {

    class recyclerAdapterViewholder(binding: RecyclerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val personName: TextView = binding.name
        val personAge: TextView = binding.age
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerAdapterViewholder {
        val binding: RecyclerLayoutBinding = RecyclerLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return recyclerAdapterViewholder(binding)
    }

    override fun onBindViewHolder(holder: recyclerAdapterViewholder, position: Int) {
        holder.personName.text = infoModel[position].name
        holder.personAge.text = infoModel[position].age.toString()
    }

    override fun getItemCount(): Int {
        return infoModel.size
    }

}


