package Chap8;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class URL_test {
public static void main(String[] args) throws IOException {

    java.net.URL url = new java.net.URL("https://www.youtube.com/");
    InputStream is = url.openStream();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();
    while(i != -1){
        System.out.print((char)i);
        i = isr.read();
    }
    isr.close();
}
}