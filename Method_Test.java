import org.junit.*;
import static org.junit.Assert.*;

public class Method_Test {
    @Test 
    public void simoleAddTest() {
        int result = Method.Add(1, 2);
        assertEquals(3, result);
    }
}