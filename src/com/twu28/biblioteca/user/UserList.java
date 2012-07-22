package com.twu28.biblioteca.user;

import java.util.ArrayList;
import java.util.List;

class UserList {
    private List<User> userList = new ArrayList<User>();
    
    private UserList(){
        userList.addAll(new UserDataBase().getUserList());
    }

    public static List<User> getUserList() {
        return new UserList().userList;
    }
}