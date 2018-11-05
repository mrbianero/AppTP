package myApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    public static Connection connect() {
        String username = "root";
        String password = "dolphin123";
        String conectionURL = "jdbc:mysql://localhost/mydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (DriverManager.getConnection(conectionURL, username, password));
            //System.out.println(connection);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
