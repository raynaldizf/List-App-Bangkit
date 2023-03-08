package com.example.listappsbangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listappsbangkit.databinding.ItemListBinding
import com.example.listappsbangkit.model.MovieDataItems

class MovieAdapter (private var movieList : ArrayList<MovieDataItems>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    var onClick : ((MovieDataItems) -> Unit)? = null

    inner class ViewHolder(private val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieDataItems){
            binding.run {
                judul.text = movie.judul
//                director.text = movie.director
//                writer.text = movie.writer
                synopsis.text = movie.synopsis
                images.setImageResource(movie.image)
                itemView.setOnClickListener {
                    onClick?.invoke(movie)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bind(movie)
    }

    fun setData(data : ArrayList<MovieDataItems>){
        this.movieList = data
    }
}