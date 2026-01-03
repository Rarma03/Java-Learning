package chapter06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        // define structure (unordered)
        Set<Integer> rollNumbers = new HashSet<>();

        // how to add
        rollNumbers.add(1);
        rollNumbers.add(2);
        rollNumbers.add(1); // ignored

        // common method
        rollNumbers.remove(2);
        rollNumbers.contains(1);
        rollNumbers.size();

        // sorted set ( ordered )
        Set<Integer> mmarks = new TreeSet<Integer>();

    }
}
