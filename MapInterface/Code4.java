package org.example.MapInterface;
import java.util.*;

public class Code4 {
    public static void main(String[] args) {
        // Input maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Print the result
        System.out.println("Merged Map: " + mergedMap);
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Create a new map to store the merged result
        Map<String, Integer> result = new HashMap<>(map1);

        // Iterate through the second map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            // Sum the values if the key exists in both maps
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return result;
    }
}


