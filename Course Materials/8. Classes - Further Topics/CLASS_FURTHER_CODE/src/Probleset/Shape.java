package Probleset;

abstract class Shape implements Area, Volume {
    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
