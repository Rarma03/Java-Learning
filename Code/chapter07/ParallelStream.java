package chapter07;

import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {
        int siz = 10_000;
        List<Integer> nums = new ArrayList<>(siz);

        Random ran = new Random();
        for (int i = 0; i < siz; i++) {
            nums.add(ran.nextInt(100));
        }

        int totSum01 = nums.stream()
                .map(i -> i + 2)
                .reduce(0, (c, e) -> c + e);

        long st = System.currentTimeMillis();
        int totSum02 = nums.stream()
                .mapToInt(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n + 2;
                })
                .sum();
        long en = System.currentTimeMillis();

        long st1 = System.currentTimeMillis();
        int totSum03 = nums.parallelStream()
                .mapToInt(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n + 2;
                })
                .sum();
        long en1 = System.currentTimeMillis();

        System.out.println("Seq. time : " + (en - st));
        System.out.println("Para. time : " + (en1 - st1));

        System.out.println(totSum01 + " : " + totSum02 + " : " + totSum03);
    }
}
