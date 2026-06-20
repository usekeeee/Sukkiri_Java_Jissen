package Chap12_quiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

@Test
    public void testSetNameSuccess() {
    Bank b = new Bank();
    b.setName("ミナト");
    assertEquals("ミナト", b.getName());
}
@Test
  public void testSetNameThrowsException(){
    Bank b = new Bank();
    assertThrows(IllegalArgumentException.class,()->{
        b.setName("ケン");
    });
}
}
