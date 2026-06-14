package Chap7_quiz;

import java.io.FileReader;
import java.util.Properties;

public class PrefReader {
public static void main(String[] args)throws Exception{
    FileReader fr = new FileReader("pref.properties");

    Properties p = new Properties();
    p.load(fr);

    String capital = p.getProperty("aichi.capital");
    String food = p.getProperty("aichi.food");
    System.out.println(capital + ":" +food);
    fr.close();
}
}
