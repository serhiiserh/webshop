package com.webshop.models;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private String confirm_pass;

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public User setConfirm_pass(String confirm_pass) {
        this.confirm_pass = confirm_pass;
        return this;

    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getConfirm_pass() {
        return confirm_pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
