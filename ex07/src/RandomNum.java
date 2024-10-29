import java.util.*;

public class RandomNum{
    public void run(){
        int n;
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            n = rand.nextInt(20);
            System.out.println("The Generated Random" + n);

        }

    }



}