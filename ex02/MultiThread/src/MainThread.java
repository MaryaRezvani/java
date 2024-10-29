public class MainThread {
    public static void main(String[] args) {
        RandomNumberThread rand_num = new RandomNumberThread();
        rand_num.start();
    }
}
