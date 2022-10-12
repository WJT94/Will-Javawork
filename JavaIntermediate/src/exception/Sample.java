package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = x / (y + 1);
            int[] nums = new int[5];
            nums[4] = 200;
            Connection con = DriverManager.getConnection("", "", "");
            con.close();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
            System.out.println("There was an exception somewhere!");
            e.printStackTrace();
        } finally {
            System.out.println("Closing resources in try-catch block");
        }
        System.out.println("Bye!");
    }
}
