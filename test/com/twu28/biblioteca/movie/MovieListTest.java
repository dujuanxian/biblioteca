package com.twu28.biblioteca.movie;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieListTest {
    private List<Movie> movieList;
    private List<Movie> allMoviesInDataBase;

    @Before
    public void setup() {
        movieList = MovieList.getMovieList();
        allMoviesInDataBase = new MovieDataBase().getMovieList();
    }

    @Test
    public void testFirstMovieInMovieListIsFirstMovieInMovieDataBase() {
        assertThat(movieList.get(0).getName(), is(allMoviesInDataBase.get(0).getName()));
        assertThat(movieList.get(0).getDirector(), is(allMoviesInDataBase.get(0).getDirector()));
        assertThat(movieList.get(0).getRating(), is(allMoviesInDataBase.get(0).getRating()));
    }

    @Test
    public void testMovieListSizeEqualsMovieDataBaseSize() {
        assertThat(movieList.size(), is(allMoviesInDataBase.size()));
    }

}
