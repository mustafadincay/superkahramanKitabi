package com.mustafadincay.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycle_row.view.*

class RecyclerAdapter (val kahramanListesi : ArrayList<String>, val kahramanGorseller: ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycle_row, parent, false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.recycleViewTextView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent (holder.itemView.context,tanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = kahramanGorseller.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

}