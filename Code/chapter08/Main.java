import java.sql.*; // step - 01

public class Main {
    public static void main(String[] args) throws Exception {
        // steps : [ to connect with jdbc and use it]
        // 1. Import Package
        // 2. Load Driver
        // 3. Register Driver
        // 4. Create connection
        // 5. Create statement
        // 6. Execute statement
        // 7. Process the results
        // 8. close the connection

        // Step - 02 - Optional/not needed
        Class.forName("org.postgresql.Driver");

        // step - 03
        // general url structure : jdbc:<dbName>:<ip address>:<port>/<databaseName>
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres", pass = "raj";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Safely Made");

        // step - 05,06,07
        String query = "select sname from student where sid = 1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        // System.out.println(rs.next()); // tells if next row available

        // Using data we got
        // Note : as query start finding from 0th row and there is no data their
        // data starts from 1st row, i.e. rs.next()
        rs.next(); // move to next row

        String name = rs.getString("sname");
        System.out.println("fetched name from table is : " + name);

        // important step - 08
        con.close();
        System.out.println("Connection Closed");

    }
}
