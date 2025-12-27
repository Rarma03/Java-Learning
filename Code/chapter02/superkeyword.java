package chapter02;

class A {
    public A() {
        super();
        System.out.println("Constructor of A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor of B");
    }

    public B(int n) {
        this();
        System.out.println("Constructor of B : " + n);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
