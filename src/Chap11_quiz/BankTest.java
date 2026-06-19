package Chap11_quiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    void testSetNameSuccess() {
        Bank b = new Bank();
        b.setName("ミズホ");
        assertEquals("ミズホ", b.getName());
    }

    @Test
    void testSetNameThreeLetters() {
        Bank b = new Bank();
        b.setName("リソナ");
        assertEquals("リソナ", b.getName());
    }

    @Test
    void testSetNameThrowsException() {
        Bank b = new Bank();

        assertThrows(IllegalArgumentException.class, () -> {
            b.setName("シブ");
        });
    }
}