
// import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

class Even implements Runnable{
    public int a;

    public Even(int a){
        this.a = a;
    }

    @Override
    public void run(){
        if(this.a % 2 == 0){
            System.out.println("number" + this.a +"is Even");

        }

        }
    }

    public class GRandom extends Thread{
        
        public void run(){

        // AtomicInteger a = new AtomicInteger();
            int a;
            Random rand = new Random();

            for (int i = 0; i < 5; i++){
                a = rand.nextInt(21);
            // a.set(b);
                System.out.println(a);
                Thread t1 = new Thread(new Even(a));
                t1.start();
                
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){

                }


            }

        }
    }

