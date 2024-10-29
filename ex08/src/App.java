import java.io.*;
// import java.util.Random;


public class App {
    public static void main(String[] args){
        final File myObj = new File("filename.txt");
        final int size = 5;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(myObj));
            BufferedReader reader = new BufferedReader(new FileReader(myObj));
            Thread ProducerThread = new Thread(new Producer(writer, size));
            Thread ConsumerThread = new Thread(new Consumer(reader));

            ProducerThread.start();
            ConsumerThread.start();
            // ProducerThread.join();


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
