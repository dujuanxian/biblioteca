package com.twu28.biblioteca;


import com.twu28.biblioteca.option.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private Library myLibrary;

    @Before
    public void setup() {
        myLibrary = new Library();
    }

    @Test
    public void testLibraryCallsShowBookListOption() {
        ShowBookList mockShowBookList = mock(ShowBookList.class);
        myLibrary.setOption(mockShowBookList);
        myLibrary.runMenuOption();
        verify(mockShowBookList).run(myLibrary.currentUser);
    }
    @Test
    public void testLibraryCallsShowCollectionListOption() {
        ShowCollectionList mockShowCollectionList = mock(ShowCollectionList.class);
        myLibrary.setOption(mockShowCollectionList);
        myLibrary.runMenuOption();
        verify(mockShowCollectionList).run(myLibrary.currentUser);
    }
    @Test
    public void testLibraryCallsShowMovieListOption() {
        ShowMovieList mockShowMovieList = mock(ShowMovieList.class);
        myLibrary.setOption(mockShowMovieList);
        myLibrary.runMenuOption();
        verify(mockShowMovieList).run(myLibrary.currentUser);
    }
    @Test
    public void testLibraryCallsCheckLibraryNumberOption() {
        CheckLibraryNumber mockCheckLibraryNumber = mock(CheckLibraryNumber.class);
        myLibrary.setOption(mockCheckLibraryNumber);
        myLibrary.runMenuOption();
        verify(mockCheckLibraryNumber).run(myLibrary.currentUser);
    }
    @Test
    public void testLibraryCallsQuitApplicationOption() {
        QuitApplication mockQuitApplication = mock(QuitApplication.class);
        myLibrary.setOption(mockQuitApplication);
        myLibrary.runMenuOption();
        verify(mockQuitApplication).run(myLibrary.currentUser);
    }
    @Test
    public void testOptionNumber(){
        Command mockCommand = mock(Command.class);
        when(mockCommand.getNextInt("Input the number of the menu option between 1 to " +
                Option.TOTAL_OPTION_NUMBER)).thenReturn(1);
        int optionNumber = myLibrary.getOptionNumber(mockCommand);
        assertThat(optionNumber, is(1));
    }
    @Test
    public void testIsValidOptionWithInput1(){
        assertThat(myLibrary.isValidOption(1), is(true));
    }
}
