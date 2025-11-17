package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AUnitTest {

 

	    @Test
	    public void testBAddsOnlyBAndSendsCorrectPrefixToC() {
	        // Arrange
	        BStub bStub = new BStub();
	        A a = new A(bStub);

	        // Act
	        String result = a.process("");

	        // Assert
	       

	        // 2. B must return whatever C returns ("BX" from the stub)
	        assertEquals("E", result);
	    }
 

}
