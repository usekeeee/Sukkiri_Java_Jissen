package Chap14_quiz;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class MovieTest {
    @Test
    void testConstructor() {
        Movie m1 = new Movie();
        assertNotNull(m1);

        Movie m2 = new Movie("タイタニック");
        assertNotNull(m2);
    }

    @Test
    void testGetterSetter(){
        Movie m3 = new Movie();

        m3.setTitle("インセプション");
        assertEquals("インセプション",m3.getTitle());

        LocalDate date = LocalDate.of(2026,6,24);
        m3.setReleaseDate(date);
        assertEquals(date, m3.getReleaseDate());
        }

        @Test
    void testSetNullThrowsException(){
        Movie m4 = new Movie();

        assertThrows(IllegalArgumentException.class,()-> m4.setTitle(null));
        assertThrows(IllegalArgumentException.class,()-> m4.setReleaseDate(null));
        }

        @Test
    void testSetFutureDateThrowsException(){
        Movie m5 = new Movie();

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        assertThrows(IllegalArgumentException.class,()-> m5.setReleaseDate(tomorrow));
        }

}
