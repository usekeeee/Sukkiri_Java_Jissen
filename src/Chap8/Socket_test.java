package Chap8;

import java.io.*;
import java.net.Socket;

public class Socket_test {
    public static void main(String[] args)throws Exception{
        Socket sock = new Socket("example.com",80);
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        os.write("GET / index.html HTTP/1.0\r\n".getBytes());
        os.write("\r\n".getBytes());
        os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        int i =isr.read();
        while(i != -1){
            System.out.print((char)i);
            i = isr.read();
        }
        sock.close();
    }
}
