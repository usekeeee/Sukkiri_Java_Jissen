package Chap7;

import java.text.*;
import java.util.*;
import java.io.*;
import java.io.FileReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args)throws Exception{
FileReader fr = new FileReader("rpgdata.csv");
Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
for(CSVRecord r : records){
    String name = r.get(0);
    String hp = r.get(1);
    String mp = r.get(2);
    System.out.println(name + "/"+ hp + "/" + mp);
}
fr.close();

   Reader fr1 = new FileReader("c:\\rpgdata.properties");
   Properties p = new Properties();
   p.load(fr1);
   String name =  p.getProperty("heroName");
   String strHp =  p.getProperty("heroHp");
   int hp =Integer.parseInt(strHp);
   System.out.println("勇者の名前:"+name);
   System.out.println("勇者のHP:"+hp);
   fr1.close();

   Writer fw2 = new FileWriter("c:\\rpgsave.properties");
   Properties p1 = new Properties();
   p1.setProperty("heroName","アサカ");
   p1.setProperty("heroHp","62");
   p1.setProperty("heroMp","45");
   p1.store(fw2,"勇者の情報");
   fw2.close();

   ResourceBundle rb = ResourceBundle.getBundle("jp.miyabilnk.rpg.rpgdata");
   String heroName = rb.getString("heroName");
   System.out.println("勇者の名前"+heroName);

   Locale loc = Locale.getDefault();
   System.out.println(loc.getCountry() + "-"+loc.getLanguage());
   String now = (new SimpleDateFormat()).format(new Date());
   ResourceBundle rb2 = ResourceBundle.getBundle("messages");
   System.out.println(rb2.getString("CURRENT_TIME_IS")+now);
    }
}
