package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    private Movie movie;

    @Before
    public void setup(){
        movie = new Movie("SholayRamesh", "Sippy", "N/A");
    }
    
    @Test
    public void nameOfMovie(){
        assertThat(movie.getName(), is("SholayRamesh"));
    }
    @Test
    public void directorOfMovie(){
        assertThat(movie.getDirector(), is("Sippy"));
    }
    @Test
    public void ratingOfMovieWithoutPreRating(){
        assertThat(movie.getRating(), is("N/A"));
    }
    @Test
    public void ratingOfMovieAfterRated1(){
        movie.setRating(1);
        assertThat(movie.getRating(), is("1"));
    }
}
