package chap1;
import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account_2> {
public int compare(Account_2 x, Account_2 y){
    return (x.zandaka - y.zandaka);
}
}
