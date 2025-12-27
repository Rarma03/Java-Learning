package chapter02;

class cute {
    private int age;
    private String name;

    // normal/defualt constructor
    public cute() {
        age = 18;
    }

    // parameterized constructor
    public cute(int a, String n) {
        age = a;
        name = n;
    }

    // public void setAge(int age){
    // // wrong mapping
    // age = age;
    // }

    public void setAge(int age) {
        // use this keyword
        this.age = age;
    }
}

public class getterSetter {
    public static void main(String[] args) {

    }
}
