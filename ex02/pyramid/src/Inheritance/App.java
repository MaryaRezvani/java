// package Inheritance;

public class App{
    public static void main(String[] args){
        // Create a pyramid
        Pyramid p = new Pyramid(4, 3, 2);

        // Display information
        System.out.println("Rectangle (base):");
        System.out.println("  Area: " + p.getArea());
        System.out.println("  Perimeter: " + p.getPerimeter());

        System.out.println("\nPyramid:");
        System.out.println("  Volume (static method): " + Pyramid.getVolume(p));
        System.out.println("  Surface Area: " + p.getSurfaceArea());
    }
}
