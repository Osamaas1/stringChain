package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testBWithStub() {
        // יוצרים סטאב של D
        CStub stub = new CStub();
        // יוצרים את C עם הסטאב
        B b = new B(stub);

        // קוראים ל־C — לא לסטאב!
        String result = b.process("H");

        // מאמתים את הפלט
        assertEquals("HEX", result);
    }
}