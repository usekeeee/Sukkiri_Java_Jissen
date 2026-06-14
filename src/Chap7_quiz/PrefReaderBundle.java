package Chap7_quiz;

import java.util.ResourceBundle;

public class PrefReaderBundle {
    public static void main(String[] args){
        ResourceBundle rb = ResourceBundle.getBundle("pref");

        String capital = rb.getString("aichi.capital");
        String food = rb.getString("aichi.food");
        System.out.println(capital + ":" +food);
    }
}
