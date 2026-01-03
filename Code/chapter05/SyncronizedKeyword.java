package chapter05;

// HERE WE STUDIED ABOUT RACE CONDITION AND SYNCRONIZED KEYWORD
// WE UNDERSTOOD HOW COUNT VALUE CHANGE IF WE DONT USE syncronized IN METHOD
// BOTH THREAD WILL USE SAME VALUE OF COUNT AT A TIME SO RESULTANT OUTPUT WILL VARY 
// AND NOT EXACTLY BE 2000 MOST OF THE TIME. THAT'S WHY WE USED sync

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SyncronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
