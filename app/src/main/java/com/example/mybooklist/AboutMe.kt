package com.example.mybooklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
@Suppress("DEPRECATION")
class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val photo = findViewById<ImageView>(R.id.img_item_photo)
        photo.setImageResource(R.drawable.agus_tinus_t)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}