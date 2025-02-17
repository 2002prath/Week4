package org.example;

    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Code_12Test {



        Code_12 userRegistration = new Code_12();

        @Test
        public void testValidUserRegistration() {
            // Valid inputs
            assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "password123"));
            assertDoesNotThrow(() -> userRegistration.registerUser("Jane123", "jane_doe@domain.co", "securePass!"));
        }

        @Test
        public void testInvalidUsername() {
            // Null username
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser(null, "test@example.com", "password123");
            });
            assertEquals("Username cannot be null or empty.", exception1.getMessage());

            // Empty username
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser("", "test@example.com", "password123");
            });
            assertEquals("Username cannot be null or empty.", exception2.getMessage());
        }

        @Test
        public void testInvalidEmail() {
            // Null email
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser("JohnDoe", null, "password123");
            });
            assertEquals("Invalid email address.", exception1.getMessage());

            // Invalid email format
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser("JohnDoe", "invalid-email", "password123");
            });
            assertEquals("Invalid email address.", exception2.getMessage());
        }

        @Test
        public void testInvalidPassword() {
            // Null password
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser("JohnDoe", "john.doe@example.com", null);
            });
            assertEquals("Password must be at least 8 characters long.", exception1.getMessage());

            // Password too short
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                userRegistration.registerUser("JohnDoe", "john.doe@example.com", "short");
            });
            assertEquals("Password must be at least 8 characters long.", exception2.getMessage());
        }
    }


