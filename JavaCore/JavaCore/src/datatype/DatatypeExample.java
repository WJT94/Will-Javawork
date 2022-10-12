package datatype;

public class DatatypeExample {
    public static void main(String[] args) {
        // All data types
        // Declararation: datatypename variablename = value;
        String name = "Will";
        byte a = 2;
        short b = 20;
        int c = 23456;
        long d = 345678l;
        
        float x = 12.55f;
        double y = 645.66;

        char ans = '\u0000';
        boolean valid = true;

        System.out.println("Hello, " + name);
        
        System.out.println("Byte type: " + a);
        System.out.println("Short type: " + b);
        System.out.println("Integer type: " + c);
        System.out.println("Long type: " + d);
        System.out.println("Float type: " + x);
        System.out.println("Double type: " + y);
        System.out.println("Char type: " + ans);
        System.out.println("Boolean type: " + valid);
    }
}
