package p1_complex;
import java.util.Scanner;

public class complex {
	private double real,im;
	
	public complex (double real,double im){
		this.real = real;
		this.im = im ;
	}
	
	public complex (double real){
		this.real = real;
		this.im = 0;
	}
	
	public complex (){
		this.real = 0;
		this.im = 0;
	}
	
	public void print(){
		System.out.print(this.real +"+"+ this.im+"i\n");
	}

	public void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the real part :");
		this.real = input.nextDouble();
		System.out.print("please enter the imaginary part :");
		this.im = input.nextDouble();
	}
	
	public complex add(complex other){
		complex c = new complex();
		c.real = this.real + other.real;
		c.im = this.im + other.im;
		return c;
		
	}
	
	public void add(complex c1,complex c2){
		this.real = c1.real + c2.real;
		this.im = c1.im + c2.im ;
	}
}
