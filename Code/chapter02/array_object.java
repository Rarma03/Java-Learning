package chapter02;

class Student {
    int roll;
    String name = "";
}

public class array_object {
    public static void main(String[] args) {

        // we are only creating 1 array object that can hold
        // references to 3 Student objects
        Student s[] = new Student[3];

        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
        }

        s[0].roll = 1;
        s[0].name = "RajVerma";

        s[1].roll = 2;
        s[1].name = "Raj";

        s[2].roll = 3;
        s[2].name = "Verma";

        // how to print
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].name + " : " + s[i].roll);
        }

        // alter
        for (Student val : s) {
            System.out.println(val.name + " : " + val.roll);
        }
    }
}
