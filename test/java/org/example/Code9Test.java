package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Code9Test {



        Code9 passwordValidator = new Code9();

        @Test
        public void testValidPasswords() {
            // Valid passwords
            assertTrue(passwordValidator.validatePassword("Password1")); // Uppercase, digit, length >= 8
            assertTrue(passwordValidator.validatePassword("StrongPass123")); // Uppercase, digits, length > 8
            assertTrue(passwordValidator.validatePassword("HelloWorld99")); // Uppercase, digits, length > 8
        }

        @Test
        public void testInvalidPasswords() {
            // No uppercase letter
            assertFalse(passwordValidator.validatePassword("password1")); // Only lowercase

            // No digit
            assertFalse(passwordValidator.validatePassword("Password")); // Uppercase but no digit

            // Too short
            assertFalse(passwordValidator.validatePassword("Pass1")); // Uppercase, digit, but < 8 characters

            // No uppercase and no digit
            assertFalse(passwordValidator.validatePassword("password")); // All lowercase and no digit
        }

        @Test
        public void testNullAndEmptyPasswords() {
            // Null password
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                passwordValidator.validatePassword(null);
            });
            assertEquals("Password cannot be null or empty.", exception1.getMessage());

            // Empty password
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                passwordValidator.validatePassword("");
            });
            assertEquals("Password cannot be null or empty.", exception2.getMessage());
        }
    }


