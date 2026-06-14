package Chap6;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        FileWriter fw1 = new FileWriter("c:\\rpgsave.dat",true);
        fw1.write('A');
        fw1.close();

    FileReader fw2 = new FileReader("rpgsave.dat");
    System.out.println("すべてのデータを読んで表示します");
    int i = fw2.read();
    while (i != 1){
        char c = (char)i;
        System.out.println(c);
        i = fw2.read();
    }
    System.out.println("ファイルの末尾に達しました");
    fw2.close();

   FileOutputStream fos = new FileOutputStream("rpgsave.dat",true);
   fos.write(65);
   fos.flush();
   fos.close();

   String msg = "第一土曜日は資源ごみの回収です。";
   Reader sr = new StringReader(msg);
   System.out.print((char)sr.read());
   System.out.print((char)sr.read());

   ByteArrayOutputStream baos = new ByteArrayOutputStream();
   baos.write(65);
   baos.write(66);
   byte[] data = baos.toByteArray();
   for(byte b : data){
       System.out.println(b);
   }
    }
}
