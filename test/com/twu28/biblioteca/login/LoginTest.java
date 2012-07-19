package com.twu28.biblioteca.login;

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
    public void testLoginStatusWithRightUserNameAndPassword(){
        login.logInLibrary(new User("111-1111", "admin"));
        assertThat(login.getLoginStatus(), is(true));
    }
    @Test
    public void testLoginStatusWithWrongUserNameAndPassword(){
        login.logInLibrary(new User("111-1112", "aaa"));
        assertThat(login.getLoginStatus(), is(false));
    }
}
