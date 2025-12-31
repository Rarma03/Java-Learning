package chapter05;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("A");
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}

public class RunnableCreation {
    public static void main(String[] args) {

        // obj is reference of Runnable and type of A or B
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // We made obj to Runnable as we need to feed it to
        // thread object for execution
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
