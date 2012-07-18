package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowMovieListTest {
    private Library library;
    private ShowMovieList showMovieList;

    @Before
    public void setup(){
        library = new Library();
        showMovieList = new ShowMovieList(library);
    }
    
    @Test
    public void movieNumberIs15AfterInitialization(){
        assertThat(library.getMovieList().size(), is(15));
    }
}
