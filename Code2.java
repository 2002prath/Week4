package org.example;

    import java.util.Scanner;
import java.util.InputMismatchException;
public class Code2 {


        public static void main(String[] args) {
            // Create a scanner object for user input
            Scanner scanner = new Scanner(System.in);

            try {
                // Ask the user for two numbers
                System.out.print("Enter the numerator: ");
                int numerator = scanner.nextInt();  // Read numerator
                System.out.print("Enter the denominator: ");
                int denominator = scanner.nextInt();  // Read denominator

                // Perform the division
                int result = numerator / denominator;
                System.out.println("The result of division is: " + result);
            }
            // Handle the case where the user attempts to divide by zero
            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }
            // Handle the case where the user inputs a non-numeric value
            catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid numbers.");
            }
            // Close the scanner
            finally {
                scanner.close();
            }
        }
    }


