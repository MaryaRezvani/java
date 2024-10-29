import java.io.*;
import java.util.Random;

public class Producer extends Thread{
    public BufferedWriter writer;
    public int size = 5;
    public Producer(BufferedWriter writer, int size) throws InterruptedException{
        this.writer = writer;
        this.size = size;
    }
    @Override
    public void run(){
        while(true){
            synchronized(writer){
                try{
                    Random rand = new Random();
                    int num = rand.nextInt(100);
                    writer.write(num + "\n");
                    System.out.println("Produced: " + num);
                    // writer.wait(1000);
                    Thread.sleep(500);
                    writer.close();
                }
                catch(IOException | InterruptedException e){
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}