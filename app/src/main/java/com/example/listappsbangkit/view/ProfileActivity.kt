package com.example.listappsbangkit.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.listappsbangkit.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val image = intent.getIntExtra("image", 0)

        binding.run {
            txtNama.text = nama
            txtEmail.text = email
            Glide.with(this@ProfileActivity)
                .load(image)
                .into(circleImageView2)
            btnCall.setOnClickListener{
                val phoneNumber = "082223018700"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            btnBack.setOnClickListener{
                onBackPressed()
            }
        }
    }
}