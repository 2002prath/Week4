package org.example;

    import java.util.Scanner;
public class Code9 {

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input for array size and divisor
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.print("Enter an index to access: ");
            int index = sc.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = sc.nextInt();

            try {
                // Try to access the array element
                try {
                    System.out.println("Array element at index " + index + ": " + array[index]);

                    // Try to divide the array element by the divisor
                    int result = array[index] / divisor;
                    System.out.println("Result of division: " + result);
                }
                // Nested try-catch to handle ArrayIndexOutOfBoundsException and ArithmeticException
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array index!");
                }
                catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            }
            catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            sc.close();
        }
    }


