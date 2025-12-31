package chapter04;

class Annotation {

    // ==============================
    // 1. @Override
    // ==============================
    // Ensures method is actually overriding parent method

    static class Parent {
        void show() {
            System.out.println("Parent show");
        }
    }

    static class Child extends Parent {
        @Override
        void show() {
            System.out.println("Child show");
        }
    }

    // ==============================
    // 2. @Deprecated
    // ==============================
    // Marks method as old / not recommended

    @Deprecated
    static void oldMethod() {
        System.out.println("Old method");
    }

    static void newMethod() {
        System.out.println("New method");
    }

    // ==============================
    // 3. @SuppressWarnings
    // ==============================
    // Suppresses compiler warnings

    @SuppressWarnings("unused")
    static void warningExample() {
        int x = 10; // unused variable warning suppressed
    }

    // ==============================
    // 4. @FunctionalInterface
    // ==============================
    // Ensures only ONE abstract method exists

    @FunctionalInterface
    interface Calculator {
        int add(int a, int b);
    }

    public static void main(String[] args) {

        // @Override demo
        Parent p = new Child();
        p.show();

        // @Deprecated demo
        oldMethod(); // compiler warning
        newMethod();

        // @FunctionalInterface demo
        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(5, 3));
    }
}