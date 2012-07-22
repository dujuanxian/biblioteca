package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.movie.MovieList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowMovieListTest {
    private ShowMovieList showMovieList;

    @Before
    public void setup(){
        showMovieList = new ShowMovieList();
    }
    
    @Test
    public void movieNumberIs15AfterInitialization(){
        assertThat(MovieList.getMovieList().size(), is(15));
    }
}
