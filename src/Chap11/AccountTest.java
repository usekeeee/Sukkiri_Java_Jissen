package Chap11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    // ❌ mainメソッドは不要なので消しました

    @Test
        // ⭕ staticを消して、privateからvoid（またはpublic void）にします
    void testInstantiate(){
        System.out.println("Accountをnewできるかテストします");
        Account a = new Account("ミナト", 30000);

        // ⭕ JUnitの自動判定機能に変えます
        assertEquals("ミナト", a.owner);
        assertEquals(30000, a.zandaka);

        System.out.println("テストを終了します");
    }

    @Test
        // ⭕ 振込テストも static を消します
    void testTransfer(){
        System.out.println("口座振込のテストをします");
        Account from = new Account("ミナト", 30000);
        Account to = new Account("アサカ", 10000);

        from.transfer(to, 5000);

        assertEquals(25000, from.zandaka);
        assertEquals(15000, to.zandaka);
    }
}