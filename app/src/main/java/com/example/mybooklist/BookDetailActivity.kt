package com.example.mybooklist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val dataBook = intent.getParcelableExtra<Book>("Book") as Book

        val name = findViewById<TextView>(R.id.tv_item_name)
        val description = findViewById<TextView>(R.id.tv_item_description)
        val photo = findViewById<ImageView>(R.id.img_item_photo)
        val date = findViewById<TextView>(R.id.tv_item_date)
        val status = findViewById<TextView>(R.id.tv_item_status)

        photo.setImageResource(dataBook.photo)
        name.text = dataBook.name
        description.text = dataBook.description
        date.text = "Tanggal Ditambahkan: ${dataBook.date}"
        status.text = "Status Buku: ${dataBook.status}"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}