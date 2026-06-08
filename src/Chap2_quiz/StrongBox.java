package Chap2_quiz;

public class StrongBox <E>{
    private E item;
    private final KeyType keyType;
    private int count = 0;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(E item){
        this.item = item;
    }

    public E get(){
       this.count++;
        if(this.count < this.keyType.getRequiredCount()){
            return null;
        }
        return this.item;
    }

    public enum KeyType{PADLOCK(1024),BUTTON(10000),DIAL(30000),FINGER(1000000);
    private final int requiredCount;
    public int getRequiredCount(){
       return this.requiredCount ;
    }

    KeyType(int requiredCount){
        this.requiredCount = requiredCount;
    }
    }

}
