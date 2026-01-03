package chapter07;

import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // print like
        nums.forEach(n -> System.out.println(n)); // output : 12345

        // TRADITIONAL WAY
        // but what you want a quick copy of nums, which help
        // you look how array will look lets say on removing odd numbers !?
        // so we have STREAM
        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2 = s1.filter(n -> (n % 2 == 0)); // output : 24
        // ( filter returns stream )

        s2.forEach(n -> System.out.println(n));

        // now double all values
        // Stream<Integer> s3 = s1.map(n -> n * 2);

        // ENHANCED WAY - to use stream
        int result = nums.stream()
                .filter(n -> (n % 2 != 0))
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}
