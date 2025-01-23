import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {
    
    @Test
    public void testAdd() {
        assertEquals(3, Addition.add(1, 2));
        assertEquals(0, Addition.add(-1, 1));
        assertEquals(0, Addition.add(0, 0));
        assertEquals(300, Addition.add(100, 200));
    }
    @Test
    public void testAdd() {
        assertEquals(12, Addition.mul(4, 3));
        assertEquals(1, Addition.mul(1, 1));
        assertEquals(0, Addition.mul(0, 3));
        assertEquals(20000, Addition.mul(100, 200));
    }
}
