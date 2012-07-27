package com.twu28.biblioteca;

import com.twu28.biblioteca.option.Option;
import com.twu28.biblioteca.user.User;
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
        when(commandMock.getNextInt("Input the number of the menu option between 1 to " +
                +Option.TOTAL_OPTION_NUMBER)).thenReturn(3);
        assertThat(Application.myLibrary.getOptionNumber(commandMock), is(3));
    }
    @Test
    public void getNotificationWhenOutsideBoundsOfOptionNumber() throws Exception {
        when(commandMock.getNextInt("Input the number of the menu option between 1 to " +
                +Option.TOTAL_OPTION_NUMBER)).thenReturn(99);
        when(commandMock.getNextInt("Wrong number, try again.")).thenReturn(3);
        Application.myLibrary.getOptionNumber(commandMock);
        verify(commandMock).getNextInt("Wrong number, try again.");
    }
    @Test
    public void getUsernameCalledInputUserUsernameClass(){
        User user = new User(null, null);
        when(commandMock.getNextString("Please input your username")).thenReturn("111-1111");
        user.inputUsername(commandMock);
        assertThat(user.getInputtedUsername(), is("111-1111"));
    }
}
