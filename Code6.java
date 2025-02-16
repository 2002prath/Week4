package org.example;

public class Code6 {


        // Method to calculate interest, throws IllegalArgumentException if amount or rate is negative
        public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
            if (amount < 0 || rate < 0) {
                // Throwing the exception if input is invalid
                throw new IllegalArgumentException("Amount and rate must be positive");
            }

            return amount * rate * years / 100;
        }

        public static void main(String[] args) {
            double amount = -1000;
            double rate = 5;
            int years = 10;

            try {
                // Call the calculateInterest method and handle any exceptions
                double interest = calculateInterest(amount, rate, years);
                System.out.println("Calculated interest: " + interest);
            } catch (IllegalArgumentException e) {
                // Catch the exception thrown by the calculateInterest method
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }


