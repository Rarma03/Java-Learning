package chapter06;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        // how to define
        Map<String, Integer> marks = new HashMap<>();

        // how to add
        marks.put("Raj", 90);
        marks.put("Aman", 85);

        // common methods
        marks.get("Raj");
        marks.remove("Aman");
        marks.containsKey("Raj"); // exist or not

        // fetch all keys or values
        Set<String> keys = marks.keySet();
        Collection<Integer> val = marks.values();

        // print
        for (String key : marks.keySet()) {
            System.out.println(key + " : " + marks.get(key));
        }

    }
}
