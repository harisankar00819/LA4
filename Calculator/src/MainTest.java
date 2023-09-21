import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(7.0, Main.add(4,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
        assertEquals(5.0, Main.add(2,3));
    }

    @Test
    void subtract() {
        assertEquals(2, Main.subtract(10,8));
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}