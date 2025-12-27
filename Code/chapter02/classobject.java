package chapter02;

class Calc {
    // what a method do is called behaviour

    // method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int substract(int a, int b) {
        if (a < b) {
            return b - a;
        }
        return a - b;
    }
}

// ------------------------------------------------
// method over-riding
class game {
    public void show() {
        /* some behaviour */ };
}

class pffh {
    public void show() {
        /* some behaviour */ };
}
// ------------------------------------------------

public class classobject {
    public static void main(String[] args) {
        Calc obj1 = new Calc();

        int res = obj1.add(5, 9);
        System.out.println(res);
    }
}

// instance and local variable
class cc {
    // instance variable
    int a;

    public void show() {
        // local variable
        int b;
    }
}
