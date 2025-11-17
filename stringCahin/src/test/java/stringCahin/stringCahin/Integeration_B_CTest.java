package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class Integeration_B_CTest {

    @Test
    public void testIntegration_BtoC_withCStub() {
        // Arrange:
        DStub dStub = new DStub();     
        C realC = new C(dStub);       
         B realB = new B(realC);        

        
        // Act: aka
        String result = realB.process("");

        // Assert:
        assertEquals("EL", result);
    }
}
