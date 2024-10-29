import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class GenerateRandom extends Thread{
    Random randint = new Random();
    AtomicInteger number;

    public GenerateRandom(AtomicInteger number){
        this.number = number;
    }

    @Override
    public void run(){
        int random_number = randint.nextInt(101);
        System.out.println("--------------------------");
        System.out.println("Generated Number Is: " + random_number);
        this.number.set(random_number);
    }
}
