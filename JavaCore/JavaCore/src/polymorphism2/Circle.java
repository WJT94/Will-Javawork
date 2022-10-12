package polymorphism2;

public class Circle extends Shape {
    float radius = 0;

    public Circle(String colour, float radius) {
        super(colour);
        this.name = "Circle";
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
