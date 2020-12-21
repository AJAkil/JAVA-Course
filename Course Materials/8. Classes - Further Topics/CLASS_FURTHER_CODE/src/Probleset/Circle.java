package Probleset;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
