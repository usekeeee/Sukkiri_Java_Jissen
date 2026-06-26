package Chap16_quiz;
import java.util.concurrent.*;

public class CountUpThread extends Thread{
   @Override
    public void run(){
        for(int i =0; i <= 50; i++){
            System.out.println(i +"..." );
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){;}
        }

    }


}
