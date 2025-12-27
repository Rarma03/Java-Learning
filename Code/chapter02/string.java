package chapter02;

public class string {
    public static void main(String[] args) {
        // In java string is a class, not a data-type
        String s = new String("RAJVERMA");
        // alternate
        String a = "RAJVERMA";

        String name = "luffy";
        String x = "Luffy";
        String y = "Luffy";

        name = "lufffy";

        // System.out.println(s);

        StringBuffer sb = new StringBuffer("Raj Verma");
        sb.append(" is very good");
        // sb = Raj Verma is very good

        sb.setCharAt(1, 'A');
        // sb = RAj Verma is very good

    }
}
