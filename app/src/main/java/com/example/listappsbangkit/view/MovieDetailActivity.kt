package com.example.listappsbangkit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listappsbangkit.databinding.ActivityMovieDetailBinding
import com.example.listappsbangkit.model.MovieDataItems

class MovieDetailActivity : AppCompatActivity() {

    lateinit var binding : ActivityMovieDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = intent.getParcelableExtra<MovieDataItems>("dataMovie") as MovieDataItems

        binding.run{
            imgMovie.setImageResource(data.image)
            judul.text = data.judul
            director.text = data.director
            writer.text = data.writer
            synopsis.text = data.synopsis
            btnBack.setOnClickListener{
                onBackPressed()
            }
        }
    }
}