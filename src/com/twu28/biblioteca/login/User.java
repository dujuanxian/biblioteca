package com.twu28.biblioteca.login;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean match(User user) {
        return this.username.equals(user.username) &&
                this.password.equals(user.password);
    }

    public String getUsername() {
        return username;
    }
}
