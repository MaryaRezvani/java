
abstract class Shape {
    public abstract double get_area();
    public abstract double get_perimeter();

}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double get_area() {
        return this.width * this.height;
    }
    @Override
    public double get_perimeter() {
        return 2 * (this.width + this.height);
    }

}
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double get_area(){
        return this.side * this.side;

    }
    public double get_perimeter() {
        return 4 * (this.side);
    }
}
class Pyramid extends Shape{
    private double baseLength,height;
    public Pyramid(double baseLength, double height){
        this.baseLength = baseLength;
        this.height = height;
    }
    public double get_area(){
        double slantHeight = Math.sqrt(this.baseLength * this.baseLength / 4 + this.height * this.height);
        double lateralSurfaceArea = this.baseLength * slantHeight;
        double baseArea = this.baseLength * this.baseLength;
        return lateralSurfaceArea + baseArea;

    }
    public double get_perimeter() {
        return (this.baseLength * this.baseLength * this.height) / (3*4);
    }
}

