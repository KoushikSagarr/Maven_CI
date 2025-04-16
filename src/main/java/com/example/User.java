package com.example;

public class User {
    private String name;
    private String email;
    private String mobile;
    private String dob;
    private String password;

    public User(String name, String email, String mobile, String dob, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.dob = dob;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDob() {
        return dob;
    }

    public String getPassword() {
        return password;
    }
}
