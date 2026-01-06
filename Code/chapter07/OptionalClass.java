package chapter07;

import java.lang.reflect.Array;
import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Rechal");

        // String srch = names.stream()
        // .filter(str -> str.contains("j"))
        // .findFirst();

        Optional<String> srch1 = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst();

        System.out.println(srch1.orElse("Not Found"));

    }
}
