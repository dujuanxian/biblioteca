package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowBookListTest {
    private ShowBookList showBookList;
    private Library library;

    @Before
    public void setup()
    {
        library = new Library();
        showBookList = new ShowBookList(library);
    }

    @Test
    public void bookNumberIs3AndBookListAfterInitialization()
    {
        assertThat(library.getBookList().size(), is(3));
        assertThat(library.getBookList().get(0).getIsbn(), is("111"));
        assertThat(library.getBookList().get(2).getTitle(), is("Clean Code"));
    }
}
