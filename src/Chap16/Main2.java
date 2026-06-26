package Chap16;

class Battle extends Scene implements Runnable{
    public void run(){}
}
public class Main2 {
    public static void main(String[] args){
        new Thread(new Battle()).start();
    }
}
