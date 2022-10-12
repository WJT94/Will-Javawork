package conditions;

public class TestCondition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if(num1 > num2) {
            System.out.println("num1 is larger.");
        } else if (num2 > num1) {
            System.out.println("num2 is larger.");
        } else {
            System.out.println("num1 and num2 are equal.");
        }

        String city = "New York";
        if (city == "New York") {
            System.out.println("Welcome to New York.");
        } else {
            System.out.println("You are in some other part of the world.");
        }

        int x = 10;
        int y = 20;
        int z = 30;
        if (x > y && x > z){
            System.out.println("x is largest.");
        } else if (y > x && y > z) {
            System.out.println("y is largest.");
        } else if (z > x && z > y) {
            System.out.println("z is largest.");
        } else {
            System.out.println("None of these numbers is the largest.");
        }
    }
}
