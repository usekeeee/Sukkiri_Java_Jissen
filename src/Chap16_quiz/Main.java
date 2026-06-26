package Chap16_quiz;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args){
        System.out.println("0-50の数字を表示します");
        System.out.println("STOP: 停止します");

        Thread t1 = new CountUpThread();
        t1.start();
        Thread t2 = new CountUpThread();
        t2.start();
        Thread t3 = new CountUpThread();
        t3.start();
    }
}
