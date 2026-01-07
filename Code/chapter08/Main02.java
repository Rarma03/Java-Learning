import java.sql.*;
// WE WILL TRY TO FETCH ALL ROWS

public class Main02 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres", pass = "raj";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Safely Made");

        // FIRE THE QUERY
        String query = "select * from student";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | " + rs.getString("sname") + " : " + rs.getInt("marks"));
        }

        // important step - 08
        con.close();
        System.out.println("Connection Closed");
    }
}
