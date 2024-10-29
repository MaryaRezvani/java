package without_thread;

public class Main {
    public static void main(String[] args) {
        RandomNumberThread rand_num = new RandomNumberThread();
        rand_num.run();
    }
}
