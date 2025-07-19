package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginValidatorTest {
    @Test
    public void testValidLogin() {
        User user = new User("admin", "admin123");
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validate(user));
    }

    @Test
    public void testInvalidLogin() {
        User user = new User("user", "wrongpass");
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validate(user));
    }
}
