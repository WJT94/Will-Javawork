package temp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String firstName = scn.next();
        System.out.println("Please enter your last name.");
        String lastName = scn.next();
        System.out.println("Please enter your favourite number.");
        int favNum = scn.nextInt();
        System.out.println("Hi, " + firstName + " " + lastName + "! I now know your favourite number is " + favNum + ".");
        
        scn.close();
    }
}
