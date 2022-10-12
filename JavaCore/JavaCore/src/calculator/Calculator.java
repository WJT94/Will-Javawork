package calculator;

public class Calculator {
    public static void main(String[] args) {
    }

    public void doCalculation(String operator, int num1, int num2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = this.add(num1, num2);
                break;
            case "-":
                result = this.subtract(num1, num2);
                break;
            case "*":
                result = this.multiply(num1, num2);
                break;
            case "/":
                result = this.divide(num1, num2);
                break;
        }
        System.out.println(String.format("%o %s %o = %s", num1, operator, num2, result));
    }

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    int divide(int num1, int num2) {
        return num1 / num2;
    }
}
