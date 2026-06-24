package Chap15_quiz;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    private static MyLogger instance = MyLogger();

    private FileWriter writer;

    private MyLogger(){
    try {
        this.writer = new FileWriter("c:\\dummylog.txt");
    }catch (IOException e){
        e.printStackTrace();
}
    }
    public static MyLogger getInstance(){
        return instance;
    }

    public void log(String msg){
        try{
            this.writer.write(msg + "\n");
            this.writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
