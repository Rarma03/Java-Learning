package chapter01;

public class trick {
    public static void main(String[] args) {

        int a = 100_00_00; // output : 1000000
        double b = 1e5; // output : 100000
        boolean flag = true; // do not work, need true/false

        System.out.println(a);
    }
}
