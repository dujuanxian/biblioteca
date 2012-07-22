package com.twu28.biblioteca.user;

import java.util.ArrayList;
import java.util.List;

class UserDataBase {
    private List<User> userList = new ArrayList<User>();
    
    public UserDataBase(){
        userList.add(new User("111-1111", "admin"));
        userList.add(new User("111-1112", "admin"));
        userList.add(new User("111-1113", "admin"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
