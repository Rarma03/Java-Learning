package chapter02;

class Counter {

    static int count = 0; // shared by all objects

    Counter() {
        count++;
    }
}

public class keyword_static {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);
        // print 3
    }
}

class cc {
    int roll;

    // we cant call non-static in static method
    public static void show() {
        System.out.println(roll); // wrong
    }

    // but if you want to call then pass object to it
    public static void show1(cc val) {
        System.out.println(val.roll); // right
    }
}