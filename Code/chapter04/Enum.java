package chapter04;

enum Status {
    Running(100), Await(200), Failed, Successfull(4000);

    private int p;

    private Status() {
        p = 0; // default value
    }

    private Status(int p) {
        this.p = 500;
    }

    private int getPrice() {
        return p;
    }

    private void setPrice(int p) {
        this.p = p;
    }
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