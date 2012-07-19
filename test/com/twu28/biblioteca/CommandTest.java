package com.twu28.biblioteca;

import com.twu28.biblioteca.option.Option;
import com.twu28.biblioteca.option.ShowBookListTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CommandTest {

    private Command commandMock;

    @Before
    public void setup(){
        commandMock = Mockito.mock(Command.class);
    }
    
    @Test
    public void getOptionNumberWithinBoundsOf1ToTotalOptionNumber(){
        when(commandMock.getCommand("Input the number of the menu option between 1 to " +
                + Option.TOTAL_OPTION_NUMBER)).thenReturn(3);
        assertThat(Application.library.getOptionNumber(commandMock), is(3));
    }

    @Test
    public void getNotificationWhenOutsideBoundsOfOptionNumber() throws Exception {
        when(commandMock.getCommand("Input the number of the menu option between 1 to " +
                + Option.TOTAL_OPTION_NUMBER)).thenReturn(99);
        when(commandMock.getCommand("Wrong number, try again.")).thenReturn(3);

        Application.library.getOptionNumber(commandMock);

        verify(commandMock).getCommand("Wrong number, try again.");
    }
}
