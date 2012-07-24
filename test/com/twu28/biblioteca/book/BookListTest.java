package com.twu28.biblioteca.book;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookListTest {
    private List<Book> bookList;

    @Before
    public void setup() {
        bookList = BookList.getBookList();
    }

    @Test
    public void testFirstBookInBookListIsFirstBookInBookDataBase() {
        assertThat(bookList.get(0).getTitle(), is("Refactoring"));
        assertThat(bookList.get(0).getAuthor(), is("Martin Fowler"));
        assertThat(bookList.get(0).getIsbn(), is("111"));
    }

    @Test
    public void testBookListSizeEqualsBookDataBaseSize() {
        assertThat(bookList.size(), is(3));
    }
}
