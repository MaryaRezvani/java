import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger number = new AtomicInteger();
        for (int i = 0; i<10; i++){
            GenerateRandom generate_random = new GenerateRandom(number);
            OddEven odd_even_checker = new OddEven(number);
            Multiply mul_ckecker = new Multiply(number);
            generate_random.start();
            generate_random.join();
            odd_even_checker.start();
            mul_ckecker.start();
        }
    }
}
