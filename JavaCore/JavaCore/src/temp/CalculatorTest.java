package temp;

import java.util.Scanner;

import calculator.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to Cool Calculator™.");
        String operator = promptOperator(scn);
        System.out.println("Enter the first number:");
        int num1 = promptNumber(scn);
        System.out.println("Enter the second number:");
        int num2 = promptNumber(scn);
        newCalc.doCalculation(operator, num1, num2);
        System.out.println("There you go!");
        scn.close();
    }

    // Prompts the user for an operation, returns the correct operation.
    static String promptOperator(Scanner scn) {
        String output;
        System.out.println("What sort of operation would you like to perform?");
        String scnOperator = scn.nextLine();
        String operator = CalculatorTest.getOperator(scnOperator);
        if (operator.equals("error")) {
            System.out.println("Sorry, that's not a correct operator. We only do addition, subtraction, multiplication, or division.");
            output = CalculatorTest.promptOperator(scn);
        } else {
            output = operator;
        }
        return output;
    }

    // Returns +, -, *, or / as a string.
    static String getOperator(String input) {
        String output;
        switch (input) {
            case "add":
            case "addition":
            case "+":
                output = "+";
                break;
            case "sub":
            case "subtraction":
            case "subtract":
            case "-":
                output = "-";
                break;
            case "mul":
            case "multiplication":
            case "multiply":
            case "*":
                output = "*";
                break;
            case "div":
            case "division":
            case "divide":
            case "/":
                output = "/";
                break;
            default:
                output = "error";
        }
        return output;
    }
    
    static int promptNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}
