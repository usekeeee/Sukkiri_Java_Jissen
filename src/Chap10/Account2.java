package Chap10;

/**
 *口座クラス。
 * @author みない
 * @deprecated 代わりにNewAccountクラスを利用して。
 * @see NewAccount
 */
public class Account2 implements java.io.Serializable {

    /**
     * 他行への振り込みを行うメソッド。
     * @param bank 送金先銀行
     * @param dest 送金先口座
     * @param amount 送金する金額
     * @return 送金手数料
     * @exception java.lang.IllegalArgumentException
     * 残高不足の時
     */
    /* ← ここからコメント開始
    public int transfer(Bank bank, Account2 dest, int amount){

    }
    */ // ← ここでコメント終了

} // ← クラスを閉じるカッコは、コメントの外に出して単独で残す！