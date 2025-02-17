package org.example;
import java.util.regex.Pattern;

public class Code9 {





        public boolean validatePassword(String password) {
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be null or empty.");
            }

            // Regex for at least 8 characters, one uppercase letter, and one digit
            String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
            return Pattern.matches(passwordRegex, password);
        }
    }


