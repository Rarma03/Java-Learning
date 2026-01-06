package chapter07;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Raj", "Rechal", "Anita", "Rakesh");

        List<String> uNames = name.stream()
                .map(String::toUpperCase) // passing method name
                .toList();

        uNames.forEach(System.out::println); // passing method name

    }
}