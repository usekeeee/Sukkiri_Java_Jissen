package chap15;

public class SingletonFlower {
    private static SingletonFlower theInstance;
    private SingletonFlower(){}
    public static SingletonFlower getInstance(){
        if(theInstance == null){
            theInstance = new SingletonFlower();
        }
        return theInstance;
    }
}
