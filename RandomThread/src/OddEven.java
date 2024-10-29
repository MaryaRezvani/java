import java.util.concurrent.atomic.AtomicInteger;

public class OddEven extends Thread{
    AtomicInteger number;

    public OddEven(AtomicInteger number){
        this.number = number;
    }

    public void run(){
        if (this.number.get() % 2 == 0){
            System.out.println("This is even: " + this.number);
        }
        else{
            System.out.println("This is odd: " + this.number);
        }
    }
}
