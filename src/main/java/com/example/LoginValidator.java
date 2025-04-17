package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.regex.*;
//
public class LoginValidator {

    public static boolean validateName(String name) {
        return name != null && name.matches("^[A-Za-z ]+$");
    }

    public static boolean validateEmail(String email) {
        return email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean validateMobile(String mobile) {
        return mobile != null && mobile.matches("^[0-9]{10}$");
    }

    public static boolean validateDob(String dob) {
        try {
            LocalDate date = LocalDate.parse(dob);
            return date.isBefore(LocalDate.now());
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        return password != null && password.matches("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");
    }

    public static boolean validate(User user) {
        return validateName(user.getName()) &&
               validateEmail(user.getEmail()) &&
               validateMobile(user.getMobile()) &&
               validateDob(user.getDob()) &&
               validatePassword(user.getPassword());
    }
}
