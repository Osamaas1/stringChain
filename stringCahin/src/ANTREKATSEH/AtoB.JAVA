package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testBWithStub() {

 
      
         CStub stub2 = new CStub();
         B b = new B(stub2);
         A a = new A(b); 
        String result2 = a.process("");
        String result = b.process(result2.substring(0, result2.length()-1));
       

        // מאמתים את הפלט
        assertEquals("HEX", result);
    }
}