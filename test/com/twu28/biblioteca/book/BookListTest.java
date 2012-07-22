package com.twu28.biblioteca.book;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookListTest {
    private List<Book> bookList;
    private List<Book> allBooksInDataBase;

    @Before
    public void setup() {
        bookList = BookList.getBookList();
        allBooksInDataBase = new BookDataBase().getBookList();
    }

    @Test
    public void testFirstBookInBookListIsFirstBookInBookDataBase() {
        assertThat(bookList.get(0).getTitle(), is(allBooksInDataBase.get(0).getTitle()));
        assertThat(bookList.get(0).getAuthor(), is(allBooksInDataBase.get(0).getAuthor()));
        assertThat(bookList.get(0).getIsbn(), is(allBooksInDataBase.get(0).getIsbn()));
    }

    @Test
    public void testBookListSizeEqualsBookDataBaseSize() {
        assertThat(bookList.size(), is(allBooksInDataBase.size()));
    }
}
