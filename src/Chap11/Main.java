package Chap11;

public class  Main {
    public static void main(String[] args){
        System.out.println("あさーとにわざと失敗します");
        assert 1 ==0;
        System.out.println("正常終了します");
    }
}
