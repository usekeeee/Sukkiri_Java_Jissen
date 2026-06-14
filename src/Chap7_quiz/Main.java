package Chap7_quiz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws Exception{
        Employee tanaka = new Employee("田中太郎",41);
        Department dept = new Department("総務部",tanaka);

        FileOutputStream fos =new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(dept);

        oos.flush();
        oos.close();
        System.out.println("セーブ完了");
    }
}
