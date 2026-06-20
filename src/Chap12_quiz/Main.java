package Chap12_quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("引数を指定してください（例: java Main hello）");
            return;
        }

        List<String> list = new ArrayList<>();
        list.add(args[0]);
        list.add("world");

        if ("hello".equals(args[0])) {
            throw new IllegalArgumentException("helloは受け付けられません！");
        }

        for (String s : list) {
            System.out.print(s);
        }
    }
}