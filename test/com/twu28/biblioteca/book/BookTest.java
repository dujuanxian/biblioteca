package com.twu28.biblioteca.book;

import com.twu28.biblioteca.book.Book;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    private Book book;
    @Before
    public void setup()
    {
        book = new Book("111", "Refactoring", "Martin Fowler");
    }

    @Test
    public void isValidIsbn()
    {
        assertThat(book.getIsbn(), is("111"));
    }
    @Test
    public void isValidTitle()
    {
        assertThat(book.getTitle(), is("Refactoring"));
    }
    @Test
    public void isValidAuthor()
    {
        assertThat(book.getAuthor(), is("Martin Fowler"));
    }
}
