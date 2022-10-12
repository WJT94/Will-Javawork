package polymorphism2;

public class Triangle extends Shape {
    float sides = 0;

    public Triangle(String colour, float sides) {
        super(colour);
        this.name = "Triangle";
        this.sides = sides;
    }

    public double calculateArea() {
        return (Math.sqrt(3)/4)*(Math.pow(sides, 2));
    }
}
