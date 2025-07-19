package com.example;

public class LoginValidator {
    public boolean validate(User user) {
        return user != null && user.getUsername().equals("admin") && user.getPassword().equals("admin123");
    }
}
