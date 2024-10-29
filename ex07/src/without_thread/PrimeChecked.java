package without_thread;
public class PrimeChecked {
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
    public void run()  {
        System.out.println(this.a + " is " + (isPrime(this.a) ? "a prime number." : "not a prime number."));
    }
}