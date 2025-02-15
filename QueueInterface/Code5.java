package org.example.QueueInterface;
import java.util.*;
public class Code5 {
    private int[] buffer;
    private int size;
    private int head; // Points to the oldest element
    private int tail; // Points to the position where the next element will be added
    private int count; // Number of elements in the buffer

    public Code5(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        head = 0;
        tail = 0;
        count = 0;
    }

    // Add an element to the buffer
    public void add(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % size; // Move the tail forward circularly

        if (count < size) {
            count++;
        } else {
            // If the buffer is full, move the head forward (overwrite the oldest element)
            head = (head + 1) % size;
        }
    }

    // Get the current elements in the buffer
    public int[] getBuffer() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = buffer[(head + i) % size];
        }
        return result;
    }

    public static void main(String[] args) {
         Code5 circularBuffer = new Code5(3); // Buffer size is 3

        // Adding elements to the buffer
        circularBuffer.add(1);
        circularBuffer.add(2);
        circularBuffer.add(3);

        // Print buffer
        System.out.println("Buffer: " + java.util.Arrays.toString(circularBuffer.getBuffer())); // Output: [1, 2, 3]

        // Add another element (overwrites oldest)
        circularBuffer.add(4);
        System.out.println("Buffer: " + java.util.Arrays.toString(circularBuffer.getBuffer())); // Output: [2, 3, 4]

        // Add another element
        circularBuffer.add(5);
        System.out.println("Buffer: " + java.util.Arrays.toString(circularBuffer.getBuffer())); // Output: [3, 4, 5]
    }
}

