package chap1;

public class Account_2 implements Comparable<Account_2>{
    int number;
    int zandaka;
    public int compareTo(Account_2 obj){
        if(this.number < obj.number){
            return -1;
        }
        if(this.number > obj.number){
            return 1;
        }
           return 0;
    }
}
