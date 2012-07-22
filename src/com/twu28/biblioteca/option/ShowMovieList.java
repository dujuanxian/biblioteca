package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.user.User;
import com.twu28.biblioteca.movie.Movie;
import com.twu28.biblioteca.movie.MovieList;

import java.awt.*;

class ShowMovieList extends Option {

    public void run(User currentUser){
        for (Movie movie: MovieList.getMovieList()) {
            Application.colorOutput.format("%-30s", movie.getName(), Color.ORANGE, Color.BLACK);
            Application.colorOutput.format("%-20s", movie.getDirector(), Color.ORANGE, Color.BLACK);
            Application.colorOutput.format("%-4s\n", movie.getRating(), Color.ORANGE, Color.BLACK);
        }
    }
}
