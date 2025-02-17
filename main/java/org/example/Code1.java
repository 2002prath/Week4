package org.example;

public class Code1 {



        // Adds two numbers
        public int add(int a, int b) {
            return a + b;
        }

        // Subtracts second number from first
        public int subtract(int a, int b) {
            return a - b;
        }

        // Multiplies two numbers
        public int multiply(int a, int b) {
            return a * b;
        }

        // Divides first number by second (handles division by zero)
        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        }
    }



