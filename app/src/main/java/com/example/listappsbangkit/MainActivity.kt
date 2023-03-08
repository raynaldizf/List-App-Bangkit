package com.example.listappsbangkit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listappsbangkit.adapter.MovieAdapter
import com.example.listappsbangkit.databinding.ActivityMainBinding
import com.example.listappsbangkit.viewmodel.MovieViewModel
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listappsbangkit.model.MovieDataItems
import com.example.listappsbangkit.view.MovieDetailActivity
import com.example.listappsbangkit.view.ProfileActivity

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : MovieAdapter
    private val viewModel : MovieViewModel by viewModels()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataMovie()
        viewModel.getMovie()
        viewModel.vmMovie.observe(this) {
            adapter.setData(it as ArrayList<MovieDataItems>)
        }

        binding.aboutPage.setOnClickListener{
            var nama = "Raynaldi Zulfikar"
            var email = "a042dkx4396@bangkit.academy\n"
            var image = R.drawable.profile

            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("image", image)
            startActivity(intent)
        }
    }

    private fun setDataMovie(){
        adapter = MovieAdapter(ArrayList())
        binding.rvMovie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMovie.adapter = adapter

        adapter.onClick = {
            val bundle = Bundle()
            bundle.putParcelable("dataMovie", it)

            val intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}