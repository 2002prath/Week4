package org.example;

    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Code_11Test {



        Code_11 dateFormatter = new Code_11();

        @Test
        public void testValidDates() {
            // Test valid date formatting
            assertEquals("25-12-2023", dateFormatter.formatDate("2023-12-25"));
            assertEquals("01-01-2024", dateFormatter.formatDate("2024-01-01"));
            assertEquals("29-02-2024", dateFormatter.formatDate("2024-02-29")); // Leap year test
        }

        @Test
        public void testNullAndEmptyDates() {
            // Test null input
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate(null);
            });
            assertEquals("Input date cannot be null or empty.", exception1.getMessage());

            // Test empty input
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("");
            });
            assertEquals("Input date cannot be null or empty.", exception2.getMessage());
        }

        @Test
        public void testInvalidDateFormats() {
            // Invalid format: Missing parts
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("2023-12");
            });
            assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception1.getMessage());

            // Invalid format: Extra characters
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("2023-12-25T10:15:30");
            });
            assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception2.getMessage());

            // Invalid format: Non-numeric input
            Exception exception3 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("abcd-ef-gh");
            });
            assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception3.getMessage());
        }

        @Test
        public void testInvalidDates() {
            // Invalid date: Nonexistent date
            Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("2023-02-30");
            });
            assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception1.getMessage());

            // Invalid date: February 29 in a non-leap year
            Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
                dateFormatter.formatDate("2023-02-29");
            });
            assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception2.getMessage());
        }
    }


