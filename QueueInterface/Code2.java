package org.example.QueueInterface;

    import java.util.*;
public class Code2 {


        public static void main(String[] args) {
            int N = 5; // Number of binary numbers to generate
            List<String> binaryNumbers = generateBinaryNumbers(N);

            System.out.println("First " + N + " binary numbers: " + binaryNumbers);
        }

        public static List<String> generateBinaryNumbers(int N) {
            // Result list to store the binary numbers
            List<String> result = new ArrayList<>();

            // Queue to generate binary numbers
            Queue<String> queue = new LinkedList<>();

            // Start with "1" in the queue
            queue.add("1");

            // Generate binary numbers until the required count is reached
            for (int i = 0; i < N; i++) {
                // Remove the front binary number from the queue
                String current = queue.remove();
                result.add(current); // Add it to the result list

                // Enqueue the next two binary numbers
                queue.add(current + "0");
                queue.add(current + "1");
            }

            return result;
        }
    }


