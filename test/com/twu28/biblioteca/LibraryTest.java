package com.twu28.biblioteca;


import com.twu28.biblioteca.book.BookList;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

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
        Application.colorOutput.println("Welcome to the Bilioteca Library.", Color.RED, Color.BLACK);
    }
    
    @Test
    public void bookListNumberAfterLibraryCreatedIs3()
    {
//        int bookListNumber = BookList.getBookList().size();
        /*
         * 3 is a magic number here. How could we bet rid of it?
         *
         * Hint: What is the purpose of the test?
         */
//        assertThat(bookListNumber, is(3));
    }
}
