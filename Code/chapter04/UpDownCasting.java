package chapter04;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {

        // ===== UPCASTING =====
        Animal a = new Dog(); // automatic
        a.eat(); // allowed
        // a.bark(); ❌ not allowed

        // ===== DOWNCASTING =====
        Dog d = (Dog) a; // manual
        d.bark(); // allowed
    }
}
