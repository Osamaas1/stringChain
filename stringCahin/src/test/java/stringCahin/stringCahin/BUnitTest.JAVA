package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class BUnitTest {

    @Test
    public void testBun() {
     
        CStub cStub = new CStub();
        B b = new B(cStub);

      
        String result = b.process("");

        
        assertEquals("E", result);
    }
}
