package OpenClose;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String colour, float length, float width){
        super(colour);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }
}
