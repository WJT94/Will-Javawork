package OpenClose;

public class ShapePrinter {
    public static void printArea(Shape shape) {
        System.out.println(String.format("%s has an area of %s",
            shape.getName(), shape.getArea()));
    }

    public static void printColour(Shape shape) {
        System.out.println(String.format("%s is coloured %s",
            shape.getName(), shape.getColour().toLowerCase()));
    }
}
