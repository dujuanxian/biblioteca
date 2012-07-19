package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowBookListTest {
    private ShowBookList showBookList;

    @Before
    public void setup()
    {
        showBookList = new ShowBookList();
    }

    @Test
    public void bookNumberIs3AndBookListAfterInitialization()
    {
        assertThat(Application.library.getBookList().size(), is(3));
        assertThat(Application.library.getBookList().get(0).getIsbn(), is("111"));
        assertThat(Application.library.getBookList().get(2).getTitle(), is("Clean Code"));
    }
}
