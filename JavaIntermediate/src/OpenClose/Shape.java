package OpenClose;

public abstract class Shape {
    String colour;
    String name;

    public Shape(String colour) {
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    } 

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract double getArea();
}
