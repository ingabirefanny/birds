package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBird4Binding
import com.squareup.picasso.Picasso

class bird4 : AppCompatActivity() {
    lateinit var binding: ActivityBird4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        binding.imageView12.setOnClickListener {
            finish()
        }

        binding.imageView11.setOnClickListener{
            val intent = Intent(this,bird5::class.java)
            startActivity(intent)
        }
        Picasso
            .get().load("https://images.unsplash.com/photo-1549608276-5786777e6587?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJpcmRzfGVufDB8fDB8fHww").into(binding.imageView)
    }
}