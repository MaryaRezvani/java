import java.util.*;

class EvenNum implements Runnable {
    public int a;
    public EvenNum(int a) {
        this.a = a;
    }
    @Override
    public void run() {
        // while(true){
        if (this.a % 2 == 0) {
            System.out.println("Thread "+ this.a +" is EVEN and Square " + this.a * this.a);
        }
    }
}

class OddNum implements Runnable {
    public int a;
    public OddNum(int a)  {
        this.a = a;
    }
    @Override
    public void run()  {
        // while(true){
        if(this.a % 2 != 0){
            System.out.println("The Thread "+ this.a +" is ODD and Cube of " + this.a +
            " is: " + this.a * this.a * this.a);
        }
    }
}

class PrimeChecked implements Runnable{
    public int a;
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
            return true;
    }
    public PrimeChecked(int a){
        this.a = a;
    }
    @Override
    public void run()  {
        System.out.println(this.a + " is " + (isPrime(this.a) ? "a prime number." : "not a prime number."));
    }
}

class RandomNumberThread extends Thread {
    public void run() {
        int n;
        Random rand = new Random();
        while(true){
        // for(int i=0;i<5;i++){
            n = rand.nextInt(100);
            System.out.println("Generated Number is " + n);
            Thread thread1 = new Thread(new PrimeChecked(n));
            Thread thread2 = new Thread(new EvenNum(n));
            Thread thread3 = new Thread(new OddNum(n));

            thread1.start();
            thread2.start();
            thread3.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
