package org.example;
    import java.util.Scanner;



    // Custom exception class for InvalidAgeException
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class  Code3 {

        // Method to validate the age
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }
        }

        public static void main(String[] args) {
            // Create a scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            // Take user input for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Try-catch block to handle the custom exception
            try {
                // Validate the age
                validateAge(age);
                // If valid, print "Access granted!"
                System.out.println("Access granted!");
            } catch (InvalidAgeException e) {
                // Catch and print the custom exception message
                System.out.println(e.getMessage());
            } finally {
                // Close the scanner object
                scanner.close();
            }
        }
    }


