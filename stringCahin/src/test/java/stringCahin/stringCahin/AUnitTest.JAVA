package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class AUnitTest {
    @Test
    public void testAWithStub() {
        // יוצרים סטאב של B
        BStub stub = new BStub();
        // יוצרים את  A עם הסטאב
        A a = new A(stub);

        // קוראים ל־D— לא לסטאב!
        String result = a.process("");

        // מאמתים את הפלט
        assertEquals("HX", result);
    }
}