package OpenClose;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle("Orange", 3.0);
        
        ShapePrinter.printArea(c);
        ShapePrinter.printColour(c);
    }
}