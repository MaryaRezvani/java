package cp;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        final String fileName = "buffer.txt";
        final int bfSize = 5;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            Thread producerThread = new Thread(new Producer(writer, bfSize));
            Thread consumerThread = new Thread(new Consumer(reader));

            producerThread.start();
            // producerThread.join();

            consumerThread.start();
            consumerThread.join();



        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
