package citytest;

import java.util.Scanner;

public class CityTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello! Please enter your name.");
        String name = scn.next();
        System.out.println("Please enter your city.");
        String city = scn.next();
        
        // System.out.println("City is London: " + (city == "London"));
        // System.out.println(city.length());

        if (city.equals("London")) {
            System.out.println("Hello, " + name + ", you are from London!");
        } else if (city.equals("New York")) {
            System.out.println("Hello, " + name + ", you are a New Yorker!");
        } else {
            System.out.println("Hello, " + name + ", you are from somewhere else.");
        }

        
        scn.close();
    }
}
