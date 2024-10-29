

public class Pyramid extends Rectangle{

    private double height;
    public Pyramid(double width, double length, double height){
        super(width, length);
        this.height = height;
    }
    public static double volume(Pyramid p){
        return ((p.length * p.width) * p.height) / 3;
    }
    public void print_volume(){
        System.out.println("Volume is: " + volume(this));
    }
}
