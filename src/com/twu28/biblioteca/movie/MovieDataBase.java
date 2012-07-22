package com.twu28.biblioteca.movie;

import java.util.ArrayList;
import java.util.List;

class MovieDataBase {
    private List<Movie> movieList = new ArrayList<Movie>();

    MovieDataBase() {
        movieList.add(new Movie("SholayRamesh", "Sippy", "N/A"));
        movieList.add(new Movie("The Bourne Supremacy", "Paul Greengrass", "7"));
        movieList.add(new Movie("Titanic", "James Cameron", "10"));
        movieList.add(new Movie("The Twilight", "Bill Condon", "9"));
        movieList.add(new Movie("Transformers", "Michael Bay", "9"));
        movieList.add(new Movie("Pirates of the Caribbean", "Rob Marshall", "9"));
        movieList.add(new Movie("Black Swan", "Darren Aronofsky", "8"));
        movieList.add(new Movie("Avatar", "James Cameron", "10"));
        movieList.add(new Movie("The Great Gatsby", "Baz Luhrmann", "N/A"));
        movieList.add(new Movie("Kung Fu Panda", "Jennifer Yuh", "10"));
        movieList.add(new Movie("Source Code", "Buncan Jones", "7"));
        movieList.add(new Movie("Mission: Impossible", "David Arnold", "8"));
        movieList.add(new Movie("Dear John", "Charles Croughwell", "7"));
        movieList.add(new Movie("My Blueberry Nights", "Wong Kar Wai", "9"));
        movieList.add(new Movie("Oceans", "Jacques Cluzaud", "10"));
    }

    List<Movie> getMovieList() {
        return movieList;
    }
}
