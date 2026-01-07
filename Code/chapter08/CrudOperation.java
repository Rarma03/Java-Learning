import java.sql.*;

public class CrudOperation {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres", pass = "raj";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Safely Made");

        // FIRE THE QUERY
        String query = "insert into student values (5, 'Mohini', 80)";

        Statement st = con.createStatement();
        boolean status = st.execute(query);

        System.out.println("Status of Query : " + status);

        // important step - 08
        con.close();
        System.out.println("Connection Closed");
    }
}
