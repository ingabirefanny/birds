package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBird5Binding
import com.squareup.picasso.Picasso

class bird5 : AppCompatActivity() {
    lateinit var binding:ActivityBird5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bird5)

        val imageView10 = findViewById<ImageView>(R.id.imageView10)

        imageView10.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww")
            .into(binding.imageView9)
    }
}




