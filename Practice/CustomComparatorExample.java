package Practice;

import java.util.*;

public class CustomComparatorExample {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for String keys (based on length)
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("Carol", 35);
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("David", 40);
        treeMap.put("Eve", 45);

        // Displaying TreeMap entries (sorted by key length)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
