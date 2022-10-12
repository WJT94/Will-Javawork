package polymorphism2;

public class Square extends Shape {
    float sides = 0;

    public Square(String colour, float sides) {
        super(colour);
        this.name = "Square";
        this.sides = sides;
    }

    public double calculateArea() {
        return this.sides * this.sides;
    }
}
