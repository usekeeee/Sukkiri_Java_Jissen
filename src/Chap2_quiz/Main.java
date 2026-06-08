package Chap2_quiz;

public class Main {
    public static void main(String[] args){
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.PADLOCK);
        box.put("大事なデータ");

        for(int i =0; i< 1022; i++){
            box.get();
        }
        System.out.println("1023回目の挑戦"+box.get());
        System.out.println("1024回目の挑戦"+box.get());
    }
}
