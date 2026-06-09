package Chap3_quiz;

import java.util.List;
import java.util.function.IntPredicate;

interface Func2 {
    String call(int point, String name);
}

public class Main {
    public static void main(String[] args) {

        IntPredicate f1 = (int x) -> {
            return (x % 2 == 1);
        };
        boolean result1 = f1.test(12);
        System.out.println("12は奇数？:" + result1);

        Func2 f2 = (int point, String name) -> {
            return name + "さんは" + (point > 65 ? "合格" : "不合格");
        };

        String result2 = f2.call(54, "tatu");
        System.out.println(result2);

        List<String> names = List.of("なご","あこみーむ","ミナト","アキラ");
        names.stream()
                .filter(s -> s.length() <= 4)
                .map(s -> s + "さん")
                .forEach(System.out :: println);

    }
}