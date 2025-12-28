package chapter04;

abstract class Parent { // abstract class
    // declaring method
    public abstract void grade();
}

class Child extends Parent { // concrete class
    // defining method
    public void grade() {
        int grade = 'A';
    }
}

public class AbstractKeyword {
    // not works
    // Parent obj = new Parent();
    // works
    Parent obj1 = new Child();
}
