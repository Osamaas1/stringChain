package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testBWithStub() {

       DStub stub1 = new DStub();
         C d = new C(stub1);
         EStub stub2 = new EStub();
         D e = new D(stub2);

        String result2 = d.process("HE");
        String result = b.process(result2.substring(0, result2.length()-1));
       

        // מאמתים את הפלט
        assertEquals("HELLX", result);
    }
}