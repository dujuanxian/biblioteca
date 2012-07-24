package com.twu28.biblioteca.user;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoginTest {

    private Login login;

    @Before
    public void setup(){
        login = new Login();
    }

    @Test
    public void testLoginStatusAfterLoginWithValidUsernameAndPassword(){
        login.login("111-1111", "admin");
        assertThat(login.getLoginStatus(), is(true));
    }
    @Test
    public void testLoginStatusAfterLoginWithInValidUsernameAndPassword(){
        login.login("", "");
        assertThat(login.getLoginStatus(), is(false));
    }
}