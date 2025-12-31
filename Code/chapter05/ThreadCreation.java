package chapter05;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++)
            System.out.println("A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {

            System.out.println("B");

            // making thread go sleep
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {

        A obj = new A();

        // learn about setting priority
        obj.setPriority(9);

        // how to start a thread with object
        obj.start();

        // direct initate thread without object
        new B().start();
    }
}