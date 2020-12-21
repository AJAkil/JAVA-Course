package Probleset;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return (4/3) * Math.PI * Math.pow(getRadius(), 3);
    }
}
