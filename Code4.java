package org.example;
    import java.util.Scanner;

public class Code4 {



        public static void main(String[] args) {
            // Create a scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            // Example of initializing an array (can be null or with values)
            int[] array = {1, 2, 3, 4, 5}; // You can set this to null to test the NullPointerException case

            // Prompt the user to enter an index
            System.out.print("Enter an index to retrieve the value: ");
            int index = scanner.nextInt();

            try {
                // Attempt to retrieve and print the value at the provided index
                System.out.println("Value at index " + index + ": " + array[index]);
            }
            // Catch block to handle ArrayIndexOutOfBoundsException
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            }
            // Catch block to handle NullPointerException if the array is null
            catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
            // Catch block for other unforeseen exceptions
            catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
            // Close the scanner
            finally {
                scanner.close();
            }
        }
    }


