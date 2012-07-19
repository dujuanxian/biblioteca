package com.twu28.biblioteca.login;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean match(String username, String password) {
        return this.username.equals(username) &&
                this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }
}
