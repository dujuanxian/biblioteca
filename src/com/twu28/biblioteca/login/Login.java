package com.twu28.biblioteca.login;

import java.util.ArrayList;
import java.util.List;

public class Login {

    private List<User> userList = new ArrayList<User>();
    private boolean loginStatus;

    public Login(){
        userList.addAll(new UserDataBase().getUserList());
        loginStatus = false;
    }

    public void logInLibrary(User user) {
        if(isLogin(user))
            loginStatus = true;
    }

    private boolean isLogin(User user) {
        for(User users : userList){
            if(users.match(user))
                return true;
        }
        return false;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }
}
