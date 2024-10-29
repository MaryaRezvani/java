import java.util.Random;
import java.io.*;

public class Producer extends Thread{

    private BufferedWriter writer;
    private int bfSize;

    public Producer(BufferedWriter writer, int bfSize){
        this.writer = writer;
        this.bfSize = bfSize;
    }

    @Override
    public void run(){
        try {
            Random random = new Random();
            for (int i = 0; i < this.bfSize; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(String.valueOf(randomNumber));

                // writer.close();
                // consumerThread.start();
                writer.newLine();
                System.out.println("Produced: " + randomNumber);
                Thread.sleep(500);
            }
            writer.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}






