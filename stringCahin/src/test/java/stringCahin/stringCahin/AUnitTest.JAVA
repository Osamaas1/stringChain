package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AUnitTest {

 

	    @Test
	    public void testAun() {
	      
	        BStub bStub = new BStub();
	        A a = new A(bStub);
 
	        String result = a.process("");

	   
	        assertEquals("H", result);
	    }
 

}
