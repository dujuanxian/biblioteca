package com.twu28.biblioteca.user;

import java.util.ArrayList;
import java.util.List;

class UserList {
    private List<User> userList = new ArrayList<User>();
    
    private UserList(){
        userList.add(new User("111-1111", "admin"));
        userList.add(new User("111-1112", "admin"));
        userList.add(new User("111-1113", "admin"));
    }

    public static List<User> getUserList() {
        return new UserList().userList;
    }
}