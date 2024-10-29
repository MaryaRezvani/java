public class MultiThreadRandOddEven {
    public static void main(String[] args) throws Exception {
        RandomNumberThread rand_num = new RandomNumberThread();
        rand_num.start();
    }
}
