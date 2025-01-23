import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {
    
    @Test
    public void testAdd() {
        assertEquals(3, Addition.add(1, 2));
        assertEquals(0, Addition.add(-1, 1));
        assertEquals(9, Addition.add(4, 5));
        assertEquals(300, Addition.add(100, 200));
    }
}
public class MultiplyTest {
    @Test
    public void testAdd() {
        assertEquals(12, Multiply.mul(4, 3));
        assertEquals(1, Multiply.mul(1, 1));
        assertEquals(0, Multiply.mul(0, 3));
        assertEquals(20000, Multiply.mul(100, 200));
    }
}
