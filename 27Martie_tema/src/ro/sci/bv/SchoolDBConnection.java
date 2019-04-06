package ro.sci.bv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connects to the School Database
 * Takes user and password as parameters, to be filled in in the main class
 *
 * @author Marian Pescaru
 */

public class SchoolDBConnection {
    private static String user;
    private static String password;


    public SchoolDBConnection(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can't load driver");
            System.err.println(e.getMessage());
        }

        DriverManager.setLoginTimeout(60);
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append("mysql")
                    .append("://")
                    .append("localhost")
                    .append(":")
                    .append("3306")
                    .append("/")
                    .append("school")
                    .append("?user=")
                    .append(user)
                    .append("&password=")
                    .append(password).toString();
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}