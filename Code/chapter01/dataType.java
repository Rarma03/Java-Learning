package chapter01;

public class dataType {

    // ===== 1. Primitive Data Types (MOST IMPORTANT) =====

    int age = 22; // integer numbers (most used)
    double salary = 55000.75; // decimal values (very common)
    boolean isEmployed = true; // true / false (very common)
    char grade = 'A'; // single character

    // Less used but should know
    long population = 1400000000L;
    float temperature = 36.6f;
    short shortValue = 100;
    byte byteValue = 10;

    // ===== 2. String (MOST USED Non-Primitive) =====

    String name = "Raj Verma"; // stores text (very very important)

    // ===== 3. Arrays (IMPORTANT) =====

    int[] marks = { 85, 90, 78, 92 }; // multiple values of same type
    String[] subjects = { "Maths", "CS", "English" };

    // ===== 4. Wrapper Classes (IMPORTANT for Collections) =====
    // Used in ArrayList, HashMap, etc.

    Integer rollNumber = 101;
    Double height = 5.9;
    Boolean passed = true;
    Character section = 'B';

    // ===== 5. Constant (final keyword) =====

    final double PI = 3.14159; // value cannot be changed

    // ===== 6. Static Variable =====
    // Shared by all objects

    static String collegeName = "SGSITS Indore";

    // ===== 7. Local Variable (inside method) =====
    public void showLocalVariable() {
        int localCount = 5; // exists only inside this method
        System.out.println(localCount);
    }

    public static void main(String[] args) {
        dataType obj = new dataType();

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(collegeName);
    }

}
