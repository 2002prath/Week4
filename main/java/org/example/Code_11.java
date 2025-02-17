package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Code_11 {




        public String formatDate(String inputDate) {
            if (inputDate == null || inputDate.isEmpty()) {
                throw new IllegalArgumentException("Input date cannot be null or empty.");
            }

            try {

                LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                // Format it to dd-MM-yyyy format
                return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Invalid date format. Expected format is yyyy-MM-dd.");
            }
        }
    }


