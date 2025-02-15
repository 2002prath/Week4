package org.example.MapInterface;

import java.util.*;

public class Code2 {
    public static void main(String[] args) {
        // Input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Inverted map
        Map<Integer, List<String>> invertedMap = invertMap(inputMap);

        // Print the result
        System.out.println("Inverted Map: " + invertedMap);
    }

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        // Create a new map to hold the inverted data
        Map<V, List<K>> result = new HashMap<>();

        // Iterate over the input map
        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Add the key to the list of keys for the value in the result map
            result.putIfAbsent(value, new ArrayList<>());
            result.get(value).add(key);
        }

        return result;
    }
}

