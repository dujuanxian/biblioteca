package com.twu28.biblioteca.user;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void usernameAndPasswordAfterLogin(){
        user.loginWithInputUserInfo("111-1111", "admin");
        assertThat(user.isLogin(), is(true));
        assertThat(user.getUsername(), is("111-1111"));
        assertThat(user.getPassword(), is("admin"));
    }

}
