package Probleset;

public class Client {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Sphere s = new Sphere(2);

        System.out.println("The circle area is: " + c.calculateArea());
        System.out.println("The circle volume is: " + c.calculateVolume());

        System.out.println("The sphere area is: " + s.calculateArea());
        System.out.println("The sphere volume is: " + s.calculateVolume());

    }
}
