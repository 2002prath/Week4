package org.example;

    import java.util.Scanner;
public class Code7 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                // Taking user input for two integers
                System.out.print("Enter first integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int num2 = scanner.nextInt();

                // Performing division
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handling ArithmeticException (division by zero)
                System.out.println("Error: Cannot divide by zero.");
            } finally {
                // This block will always execute, whether exception occurred or not
                System.out.println("Operation completed.");
            }

            scanner.close();
        }
    }


