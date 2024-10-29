package without_thread;


public class EvenNum {
    public int a;
    public EvenNum(int a) {
        this.a = a;
    }
    public void run() {
        System.out.println("The Thread "+ this.a +" is EVEN and Square of " + this.a + " is : " + this.a * this.a);
    }
}







