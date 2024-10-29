package without_thread;
import java.util.*;

public class RandomNumberThread {
    Random rand = new Random();
    int n = 0;

    public RandomNumberThread(){
        this.n = rand.nextInt(100);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Generated Number is " + n);
            PrimeChecked thread3 = new PrimeChecked(n);
            thread3.run();
            // check if random number is even or odd
            if (n % 2 == 0) {
                EvenNum thread1 = new EvenNum(n);
                thread1.run();
            }
            else {
                OddNum thread2 = new OddNum(n);
                thread2.run();
            }
        }
    }
}
