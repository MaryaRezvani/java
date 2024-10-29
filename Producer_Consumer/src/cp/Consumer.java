package cp;
import java.io.*;


public class Consumer extends Thread {
    private BufferedReader reader;

    public Consumer(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                int randomNumber = Integer.parseInt(line);
                System.out.println("Consumed: " + randomNumber);
                Thread.sleep(1000);
            }
            reader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}