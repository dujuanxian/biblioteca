package com.twu28.biblioteca.option;

import com.twu28.biblioteca.user.User;

public class QuitApplication extends Option {

    public void run(User currentUser) {
        System.exit(-1);
    }
}
