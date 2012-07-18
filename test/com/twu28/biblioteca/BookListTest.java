package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookListTest {
    private BookList bookList;
    @Before
    public void setup()
    {
        bookList = new BookList();
    }

    @Test
    public void bookNumberWith0Book()
    {
        assertThat(bookList.getList().size(), is(0));
    }
    @Test
    public void bookNumberIs3AndBookListAfterInitialization()
    {
        /*
         * What is being tested here? The actual option or a list of books?
         *
         * What is the semantics of the class under test? Do the tests reflect that?
         */
        bookList.run(new Library());
        assertThat(bookList.getList().size(), is(3));
        assertThat(bookList.getList().get(0).getIsbn(), is("111"));
        assertThat(bookList.getList().get(2).getTitle(), is("Clean Code"));
    }
}
