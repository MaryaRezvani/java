// package Inheritance;

public class Pyramid extends Rectangle {
    private double height;

    public Pyramid(double length, double width, double height) {
        super(length, width); // Call the Rectangle constructor
        this.height = height;
    }

    public static double getVolume(Pyramid p) {
        //use the formula V = 1/3 * Area * h
        return (p.getArea() * p.height) / 3;
    }

    public double getSurfaceArea() {
        double baseArea = getArea();
        double sideArea = baseArea * Math.sqrt(1 + Math.pow(height / (2 * getwidth()), 2));
        return baseArea + 4 * sideArea;
    }
}
