package com.twu28.biblioteca.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<Movie> movieList = new ArrayList<Movie>();

    private MovieList() {
        movieList.addAll(new MovieDataBase().getMovieList());
    }

    public static List<Movie> getMovieList() {
        return new MovieList().movieList;
    }
}