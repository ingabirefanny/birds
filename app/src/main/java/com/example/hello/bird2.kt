package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBird2Binding
import com.squareup.picasso.Picasso

class bird2 : AppCompatActivity(){
    lateinit var binding: ActivityBird2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBird2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView5.setOnClickListener {
            finish()
        }
    binding.imageView4.setOnClickListener{
val intent = Intent(this,bird3::class.java)
        startActivity(intent)
    }

        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1667443534543-2a597d4250c9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView3)
    }
}
