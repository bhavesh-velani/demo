package Database;

import java.sql.*;

public class DatabaseCon {
    public static Connection getDatabaseCon() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/estore", "root", "");
        return con;
    }
}