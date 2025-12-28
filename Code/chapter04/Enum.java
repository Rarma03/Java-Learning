package chapter04;

enum Status {
    Running, Await, Failed, Successfull;
}

public class Enum {
    public static void main(String[] args) {
        // get any single of constant
        Status s = Status.Running;
        System.out.println(s);

        // get them all and access them index wise
        Status[] s_all = Status.values();

        for (Status val : s_all) {
            System.out.println(val + " : " + val.ordinal());
        }
    }
}