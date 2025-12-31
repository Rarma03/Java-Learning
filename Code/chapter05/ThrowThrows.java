package chapter05;

class ThrowThrows {

    static void check(int marks) throws Exception {
        if (marks < 40) {
            throw new Exception("Fail");
        }
    }

    public static void main(String[] args) {
        try {
            check(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}