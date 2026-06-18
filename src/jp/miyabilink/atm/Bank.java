package jp.miyabilink.atm;

/**
 * 銀行を表すクラスです。
 * @author みん
 */
public class Bank {
    /**
     * 銀行の名前
     */
    String name;
    /**
     * 銀行の住所
     */
    String address;

    /**
     * 新しい口座を銀行に追加するメソッド
     * @param owner 口座の名義人
     * @param initZandaka 初期残高
     */
    public void addAccount(String owner, int initZandaka) {}
    /**
     * 試験用のメソッドです
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        System.out.println("試験用のメインメソッドです。");
    }
}
