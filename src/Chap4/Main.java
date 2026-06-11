package Chap4;
import java.text.*;
import java.util.Locale;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");
        System.out.println("RPG:スッキリ魔王討伐 ver"+ver);
        System.out.println("Developed by"+author);

    Locale loc = Locale.getDefault();
    System.out.println(loc.getCountry()+"_"+loc.getLanguage());
    String now = (new SimpleDateFormat()).format(new Date());
    if(loc.getLanguage().equals("ja")){
        System.out.println("現在の時刻は"+now);
    }else{
        System.out.println("Current time is"+now);
    }
        long f = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        long t = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        System.out.println("現在の空きメモリ容量: " + f + "MB");
        System.out.println("JVMの合計メモリ容量: " + t + "MB");

    Class<?> info1 = String.class;
    System.out.println(info1.getSimpleName());
    System.out.println(info1.getName());
    System.out.println(info1.getPackage().getName());
    System.out.println(info1.isArray());

    Class<?> info2 = info1.getSuperclass();
    System.out.println(info2.getName());

    Class<?> info3 = args.getClass();
    System.out.println(info3.isArray());
    }
}
