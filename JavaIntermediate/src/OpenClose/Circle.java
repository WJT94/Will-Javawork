package OpenClose;

public class Circle extends Shape {
    double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
