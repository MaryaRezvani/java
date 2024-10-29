package without_thread;
public class OddNum {
    public int a;
    public OddNum(int a)  {
        this.a = a;
    }
    public void run()  {
        System.out.println("The Thread "+ this.a +" is ODD and Cube of " + this.a + " is: " + this.a * this.a * this.a);
    }
}