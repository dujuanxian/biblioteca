package com.twu28.biblioteca.user;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserListTest {
    private List<User> userList;
    private List<User> allUsersInDataBase;

    @Before
    public void setup() {
        userList = UserList.getUserList();
        allUsersInDataBase = new UserDataBase().getUserList();
    }

    @Test
    public void testFirstUserInUserListIsFirstUserInUserDataBase() {
        assertThat(userList.get(0).getUsername(), is(allUsersInDataBase.get(0).getUsername()));
        assertThat(userList.get(0).isLogin(), is(false));
    }

    @Test
    public void testUserListSizeEqualsUserDataBaseSize() {
        assertThat(userList.size(), is(allUsersInDataBase.size()));
    }

}
