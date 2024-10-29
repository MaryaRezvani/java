
import java.util.Scanner;

public class complex{
    private double real, img;
    public complex (double real, double img){
        this.real = real;
        this.img =  img;
    }
    public complex (){
		this.real = 0;
		this.img = 0;
	}
    public void print(){
        System.out.println(this.real +"+"+ this.img);
    }
    public void read(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A REAL NUMBER:");
        this.real = input.nextDouble();
        System.out.print("ENTER A IMAGINARY NUMBER:");
        this.img = input.nextDouble();
    }
    public complex add(complex second){
        complex a = new complex();
        a.real = this.real + second.real;
        a.img = this.img + second.img;
        return a;
    }
}