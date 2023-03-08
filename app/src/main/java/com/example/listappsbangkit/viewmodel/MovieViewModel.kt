package com.example.listappsbangkit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listappsbangkit.R
import com.example.listappsbangkit.model.MovieDataItems

class MovieViewModel : ViewModel(){
    val vmMovie : MutableLiveData<List<MovieDataItems>> = MutableLiveData()

    val movieList = arrayListOf(
        MovieDataItems("The Shawshank Redemption", "Frank Darabont", "Frank Darabont", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", R.drawable.shawshank),
        MovieDataItems("The Godfather", "Francis Ford Coppola", "Mario Puzo, Francis Ford Coppola", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", R.drawable.god_father_1),
        MovieDataItems("The Dark Knight", "Christopher Nolan", "Jonathan Nolan, Christopher Nolan", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", R.drawable.dark_knight),
        MovieDataItems("The Godfather: Part II", "Francis Ford Coppola", "Francis Ford Coppola, Mario Puzo", "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.", R.drawable.god_father_2),
        MovieDataItems("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Fran Walsh, Philippa Boyens, Peter Jackson", "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", R.drawable.lotr_1),
        MovieDataItems("The Matrix", "The Wachowskis", "The Wachowskis", "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.", R.drawable.matrix),
        MovieDataItems("Schindler's List", "Steven Spielberg", "Steven Zaillian", "In Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.", R.drawable.schindler),
        MovieDataItems("Pulp Fiction", "Quentin Tarantino", "Quentin Tarantino", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", R.drawable.pulp),
        MovieDataItems("The Lord of the Rings: The Two Towers", "Peter Jackson", "Fran Walsh, Philippa Boyens, Peter Jackson", "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.", R.drawable.two_tower),
        MovieDataItems("Fight Club", "David Fincher", "Jim Uhls", "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.", R.drawable.fight_club),
    )

    fun getMovie(){
        vmMovie.value = movieList
    }
}