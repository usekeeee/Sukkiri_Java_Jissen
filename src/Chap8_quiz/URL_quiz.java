package Chap8_quiz;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class URL_quiz {
    public static void main(String[] args)throws Exception{

      URL url = new URL("https://dokojava.jp/favicon.ico");

      InputStream is = url.openStream();
      FileOutputStream fos = new FileOutputStream("dj.ico");

      int i = is.read();
      while(i != -1){
          fos.write(i);
          i = is.read();
      }
      fos.close();
      is.close();
    }
}
