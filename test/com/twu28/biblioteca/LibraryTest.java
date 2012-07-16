package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    private Library myLibrary;

    @Before
    public void setup()
    {
        myLibrary = new Library();
        myLibrary.showWelcomeInterface();
    }
    
    @Test
    public void bookListNumberAfterLibraryCreatedIs3()
    {
        int bookListNumber = myLibrary.getBookList().size();
        assertThat(bookListNumber, is(3));
    }
}
