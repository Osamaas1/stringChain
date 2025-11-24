package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DUnitTest {

 

	    @Test
	    public void testAun() {
	      
	        EStub bStub = new EStub();
	        D a = new D(bStub);
 
	        String result = a.process("");

	   
	        assertEquals("L", result);
	    }
 

}
