package Chap11;

public class Account_3 {
    int zandaka;
    public void transfer(Account_3 dest, int amount){
        dest.zandaka -= amount;
        assert this.zandaka >= 0;
    }
}
