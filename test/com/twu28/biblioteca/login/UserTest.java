package com.twu28.biblioteca.login;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    
    @Before
    public void setup(){
        user = new User("111-1112", "admin");
    }

    @Test
    public void testUsernameAndPasswordMatchWithRightUser(){
        user.match(new User("111-1112", "admin"));
    }
    @Test
    public void testUsernameAndPasswordNotMatchWithWrongUser(){
        user.match(new User("111-1111", "admin"));
    }
}
