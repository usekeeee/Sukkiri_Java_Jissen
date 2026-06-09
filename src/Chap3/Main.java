package Chap3;

import java.util.function.*;

public class Main {
    public static Integer len(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // --- パターン1: メソッド参照 ---
        Function<String, Integer> func1 = Main::len;
        // 先に「Java」の長さを計算して a に入れる（4 が入る）
        int a = func1.apply("Java");
        // 画面に出力するときに文字を組み立てる
        System.out.println("文字列「Java」は" + a + "文字です（メソッド参照）");

        // --- パターン2: ラムダ式 ---
        Function<String, Integer> func2 = (String s) -> { return s.length(); };
        int n = func2.apply("Java");
        System.out.println("文字列「Java」は" + n + "文字です（ラムダ式）");
    }
}