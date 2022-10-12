package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/javadb";
            String username = "root";
            String password = "pass";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully.");
            System.out.println(con);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong!");
        }
    }   
}
