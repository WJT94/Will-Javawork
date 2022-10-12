package polymorphism2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("green", 4f);
        Square square = new Square("blue", 10f);
        Triangle triangle = new Triangle("red", 2f);

        Shape[] shapes = {circle, square, triangle};

        for (Shape s : shapes) {
            s.printStatus();
        }
    }
}
