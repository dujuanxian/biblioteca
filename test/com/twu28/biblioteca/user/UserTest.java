package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Command;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class UserTest {
    private User user;

    @Before
    public void setup(){
        user = new User(null, null);
    }

    @Test
    public void testLoginStatusWithoutLogin(){
        assertThat(user.isLogin(), is(false));
    }
    @Test
    public void collectionListSizeWithoutAddBookIs0(){
        assertThat(user.getCollectionList().size(), is(0));
    }
    @Test
    public void collectionListSizeAfterAddFirstBookIs1(){
        user.addBookToCollection(1);
        assertThat(user.getCollectionList().size(), is(1));
    }
    
    @Test
    public void testUserStatusAfterLoginWithRightUsernameAndPassword(){
        Command mockCommand = mock(Command.class);
        when(mockCommand.getNextString("Please input your username")).thenReturn("111-1111");
        user.inputUsername(mockCommand);
        when(mockCommand.getNextString("Please input your password")).thenReturn("admin");
        user.inputPassword(mockCommand);
        user.initializeUser();
        assertThat(user.isLogin(), is(true));
    }
}
