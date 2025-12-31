package chapter05;

// Functional Interface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExpression {

    public static void main(String[] args) {

        // ===== OLD WAY (Before Java 8) =====
        Calculator oldCalc = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Old way result: " + oldCalc.add(5, 3));

        // ===== NEW WAY (Java 8 Lambda) =====
        Calculator newCalc = (a, b) -> a + b;

        System.out.println("Lambda result: " + newCalc.add(5, 3));
    }
}
