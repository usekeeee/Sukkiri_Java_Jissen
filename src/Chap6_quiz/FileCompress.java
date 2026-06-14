package Chap6_quiz;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;

public class FileCompress {
public static void main(String[] args){
    String sourceFile = args[0];
    String destFile = args[1];

    try(
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        GZIPOutputStream out = new GZIPOutputStream(bos);
    ) {
        int data;
        while ((data = in.read())!= -1){
            out.write(data);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
}
}
