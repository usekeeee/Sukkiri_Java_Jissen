package Chap1_quiz;

import java.util.ArrayList;
import java.util.List;

public class Main_2 {
    public static void main(String[] args){
        Monster m1 = new Monster("ゴン",10,false);
        Monster m2 = new Monster("キルア",12,false);
        Monster m3 = new Monster("ヒソカ",100,true);

        List<Monster> monsterList =new ArrayList<>();
        monsterList.add(m1);
        monsterList.add(m2);
        monsterList.add(m3);

        System.out.println("[ハンター一覧(格納順)]");
        for(Monster m : monsterList){
            System.out.println("名前:"+m.name()+"| HP:"+m.hp()+ "|ボスか？？:"+m.isBoss());
        }
    }
}
