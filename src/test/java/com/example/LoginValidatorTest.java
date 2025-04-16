package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {

    @Test
    public void testValidUser() {
        User user = new User("Alice", "alice@example.com", "9876543210", "2000-01-01", "password1");
        assertTrue(LoginValidator.validate(user));
    }

    @Test
    public void testInvalidEmail() {
        User user = new User("Bob", "bob[at]example.com", "9876543210", "2000-01-01", "password1");
        assertFalse(LoginValidator.validate(user));
    }

    @Test
    public void testWeakPassword() {
        User user = new User("Charlie", "charlie@example.com", "9876543210", "2000-01-01", "pass");
        assertFalse(LoginValidator.validate(user));
    }

    @Test
    public void testFutureDob() {
        User user = new User("Dave", "dave@example.com", "9876543210", "2099-01-01", "password1");
        assertFalse(LoginValidator.validate(user));
    }
}
