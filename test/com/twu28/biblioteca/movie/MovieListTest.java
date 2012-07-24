package com.twu28.biblioteca.movie;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieListTest {
    private List<Movie> movieList;

    @Before
    public void setup() {
        movieList = MovieList.getMovieList();
    }

    @Test
    public void testFirstMovieInMovieListIsFirstMovieInMovieDataBase() {
        assertThat(movieList.get(0).getName(), is("SholayRamesh"));
        assertThat(movieList.get(0).getDirector(), is("Sippy"));
        assertThat(movieList.get(0).getRating(), is("N/A"));
    }

    @Test
    public void testMovieListSizeEqualsMovieDataBaseSize() {
        assertThat(movieList.size(), is(15));
    }

}
