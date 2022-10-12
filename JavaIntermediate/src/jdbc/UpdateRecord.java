package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/javadb";
            String username = "root";
            String password = "pass";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully.");

            String query = "update customer set phone = 1111111 where id = 101";
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
            System.out.println("Record updated successfully.");   
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong with connecting!");
        }
    }
}
