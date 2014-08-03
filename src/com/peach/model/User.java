package com.peach.model;

/**
 * Created by y400 on 2014/7/27.
 */
public class User {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String user;
    private String password;
}
