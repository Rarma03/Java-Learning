package chapter06;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Raj");
        names.add("Aman");
        names.add("Raj"); // duplicate allowed

        names.get(0);
        names.remove("Aman");
        names.size();
        names.contains("Raj");

        System.out.println(names);

    }
}