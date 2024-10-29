

public class Rectangle {
    protected double width, length;
    protected Rectangle (double width, double length){
        this.length = length;
        this.width = width;
    }
    protected double get_area(){
        return this.width * this.length;
    }
    protected double get_width(){
        return this.width;
    }
    protected double get_height(){
        return this.length;
    }
    protected void print(){
        System.out.println("Base Width Is: " + this.width);
        System.out.println("Base Height Is: " + this.length);
    }
}
