package org.example.QueueInterface;

import java.util.*;
public class Code4 {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Code4() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation (efficient)
    public void push(int x) {
        queue1.add(x);
    }

    // Pop operation (costly pop)
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element in queue1 is the one to pop
        int poppedElement = queue1.remove();

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;
    }

    // Top operation (costly top)
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // Get the last element in queue1
        int topElement = queue1.peek();

        // Move it to queue2 as well
        queue2.add(queue1.remove());

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        Code4 stack = new Code4();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Pop element: " + stack.pop()); // Output: 3
        System.out.println("Pop element: " + stack.pop()); // Output: 2
        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: false
    }
}

