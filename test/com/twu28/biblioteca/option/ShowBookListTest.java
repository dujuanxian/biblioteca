package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.book.BookList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class
        ShowBookListTest {
    private ShowBookList showBookList;

    @Before
    public void setup()
    {
        showBookList = new ShowBookList();
    }

    @Test
    public void bookNumberIs3AndBookListAfterInitialization()
    {
        assertThat(BookList.getBookList().size(), is(3));
        assertThat(BookList.getBookList().get(0).getIsbn(), is("111"));
        assertThat(BookList.getBookList().get(2).getTitle(), is("Clean Code"));
    }
}
