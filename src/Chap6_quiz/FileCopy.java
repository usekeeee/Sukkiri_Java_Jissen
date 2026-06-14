package Chap6_quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args)throws Exception{
     String sourceFile = args[0];
     String destFile = args[1];

        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(destFile);

        int data;
        while ((data = in.read()) != -1){
            out.write(data);
        }
            in.close();
            out.close();
    }
}
