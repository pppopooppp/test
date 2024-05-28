package com.wisform.entity;

public class LoginForm {
    private String username;
    private String password;
    private String identity;


    public LoginForm(String username, String password, String identity) {
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIdentity() {
        return identity;
    }

}

