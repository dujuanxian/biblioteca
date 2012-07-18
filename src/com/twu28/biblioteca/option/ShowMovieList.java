package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.Movie;

import java.awt.*;

public class ShowMovieList extends Option {
    private Library library;

    public ShowMovieList(Library library) {
        this.library = library;
    }
    
    public void run(){
        for (Movie movie: library.getMovieList()) {
            Library.colorOutput.format("%-30s", movie.getName(), Color.ORANGE, Color.BLACK);
            Library.colorOutput.format("%-20s", movie.getDirector(), Color.ORANGE, Color.BLACK);
            Library.colorOutput.format("%-4s\n", movie.getRating(), Color.ORANGE, Color.BLACK);
        }
    }
}
