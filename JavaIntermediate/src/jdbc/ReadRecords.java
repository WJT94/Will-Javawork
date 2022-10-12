package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadRecords {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/javadb";
            String username = "root";
            String password = "pass";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully.");

            printQuery(con, "select * from customer");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong with connecting!");
        }
    }

    public static void printQuery(Connection con, String query) {
        Statement statement;
        try {
            statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            ArrayList<ArrayList<String>> queryTable = new ArrayList<>();

            String[] columnNames = {"id", "name", "phone", "email"};

            queryTable.add(new ArrayList<String>());
            queryTable.add(new ArrayList<String>());
            for (String s : columnNames) {
                queryTable.get(0).add(s);
                queryTable.get(1).add("-");
            }

            int row = 2;
            while (result.next()) { // Add all query results to a 2D list
                queryTable.add(new ArrayList<String>());

                int id = result.getInt(1);
                String name = result.getString(2);
                int phone = result.getInt(3);
                String email = result.getString(4);
                
                queryTable.get(row).add(String.valueOf(id));
                queryTable.get(row).add(String.valueOf(name));
                queryTable.get(row).add(String.valueOf(phone));
                queryTable.get(row).add(String.valueOf(email));

                row += 1;
            }

            int numberOfColumns = queryTable.get(0).size();
            int[] columnSizes = new int[numberOfColumns];
            // Finds the length of the longest string in each column. 
            // We will use this to determine how long the whitespace should be between cells.
            // Each column's width is stored in columnSizes.
            for (int j = 0; j < numberOfColumns; j++) {
                columnSizes[j] = 0;
                for (int i = 0; i < queryTable.size(); i++) {
                    int cellLength = queryTable.get(i).get(j).length();
                    if (cellLength > columnSizes[j]) {
                        columnSizes[j] = cellLength;
                    }
                }
            }

            // for (int i : columnSizes) {
            //     System.out.println("Length: " + i);
            // }

            for (int i = 0; i < queryTable.size(); i++) { // Print results procedurally For each row...
                for (int j = 0; j < queryTable.get(i).size(); j++) { // For each column...
                    // Take the cell string, print it, and then add a number of spaces based 
                    //     on the length of the string so each cell has the same width as
                    //     others in the column.
                    String cellString = queryTable.get(i).get(j);
                    System.out.print(cellString);
                    if (j < queryTable.get(i).size() - 1) {
                        int spacesToAdd = columnSizes[j] - cellString.length();
                        System.out.print(" ");

                        for (int x = 0; x < spacesToAdd; x++) {
                            System.out.print(" ");
                        }

                        System.out.print("| ");
                    }
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong with querying!");
        }
    }
}
