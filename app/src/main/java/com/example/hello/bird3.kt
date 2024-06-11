package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBird3Binding
import com.squareup.picasso.Picasso

class bird3 : AppCompatActivity() {
    lateinit var binding: ActivityBird3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBird3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView8.setOnClickListener {
            finish()
        }

        binding.imageView7.setOnClickListener{
            val intent = Intent(this,bird4::class.java)
            startActivity(intent)
        }
        Picasso
            .get()

            .load("https://images.unsplash.com/photo-1591608971362-f08b2a75731a?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmlyZHN8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView6)
    }
}

