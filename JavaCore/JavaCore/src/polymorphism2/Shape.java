package polymorphism2;

public abstract class Shape {
    String name;
    String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public void printStatus() {
        System.out.println(String.format("%s is %s and has an area of %s.",
            this.name, this.colour, this.calculateArea()));
    }

    public abstract double calculateArea();
}
