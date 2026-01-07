import java.sql.*;

public class PrepareStatement {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres", pass = "raj";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Safely Made");

        // Run time data by user
        String name = "user";
        int sid = 6, marks = 79;

        // FIRE THE QUERY
        String query = "insert into student values(?,?,?)";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, sid);
        pst.setString(2, name);
        pst.setInt(3, marks);
        pst.execute();

        // important step - 08
        con.close();
        System.out.println("Connection Closed");
    }
}
