import java.io.*;

public class Consumer extends Thread{
    public BufferedReader reader;
    public Consumer(BufferedReader reader) throws InterruptedException{
        this.reader = reader;
    }
    @Override
    public void run(){
        while (true) {
            synchronized(reader) {
                try{
                    String line;
                    while((line = reader.readLine()) != null){

                        int num = Integer.parseInt(line);
                        System.out.println("Consuming Element" + num);
                        Thread.sleep(500);
                        // reader.wait();
                        reader.notify();
                        reader.close();

                    }
                    reader.close();
                }
                catch(IOException | InterruptedException e){
                }
            }
        }
    }


}



