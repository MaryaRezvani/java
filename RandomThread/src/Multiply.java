import java.util.concurrent.atomic.AtomicInteger;

public class Multiply extends Thread{
    AtomicInteger number;

    public Multiply(AtomicInteger number){
        this.number = number;
    }

    public void run(){
        if (this.number.get() % 3 == 0){
            System.out.println("This is multiply of 3: " + this.number);
        }
        else{
            System.out.println("This is not multiply of 3: " + this.number);
        }
    }
}
