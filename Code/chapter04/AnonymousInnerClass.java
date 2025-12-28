package chapter04;

class A {
    public void show() {
        System.out.println("old data");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("new data");
            }
        };
    }
}