package com.twu28.biblioteca.login;

import java.util.ArrayList;
import java.util.List;

public class Login {

    private List<User> userList = new ArrayList<User>();
    private boolean loginStatus = false;
    private User currentUser;

    public Login(){
        userList.addAll(new UserDataBase().getUserList());
    }

    public void logInLibrary(User user) {
        if(isLogin(user))
            loginStatus = true;
    }

    private boolean isLogin(User user) {
        for(User users : userList){
            if(users.match(user)){
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    public String getUserName() {
        if(loginStatus)
            return currentUser.getUsername();
        return null;
    }
}
