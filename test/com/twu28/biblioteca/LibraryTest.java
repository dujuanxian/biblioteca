package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
 * What about the other methods of the Library class?
 */
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
        /*
         * 3 is a magic number here. How could we bet rid of it?
         *
         * Hint: What is the purpose of the test?
         */
        assertThat(bookListNumber, is(3));
    }
}
