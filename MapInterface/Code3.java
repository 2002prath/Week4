package org.example.MapInterface;

import java.util.*;

public class Code3 {
    public static void main(String[] args) {
        // Input map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find the key with the maximum value
        String maxKey = findKeyWithMaxValue(map);

        // Print the result
        System.out.println("Key with the highest value: " + maxKey);
    }

    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Handle edge case
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}

