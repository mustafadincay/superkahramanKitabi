package com.mustafadincay.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superkahramanIsimleri = ArrayList<String>()
        superkahramanIsimleri.add("Ironman")
        superkahramanIsimleri.add("Batman")
        superkahramanIsimleri.add("Superman")

        /*
        //VERİMSİZ TANIMLAMA

        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)

        var superKahramanGorseller = ArrayList<Bitmap>()
        superKahramanGorseller.add(ironmanBitmap)
        superKahramanGorseller.add(batmanBitmap)
        superKahramanGorseller.add(supermanBitmap)

        */
        //VERİMLİ TANIMLAMA

        val ironmanDrawableId = R.drawable.ironman
        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superkahramanIsimleri, superKahramanDrawableListesi)
        recyclerView.adapter = adapter

    }
}