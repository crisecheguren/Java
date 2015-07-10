import static org.junit.Assert.*;

import org.junit.Test;


public class ConcatenateTest {
	@Test
	public void testConcatenate() {
		Concat concat = new Concat();

		String result = concat.concatenate( "one", "two" );

		System.out.println("@Test concat(): " + result + " Expected: onetwo");

		assertEquals ("onetwo", result);
	}
}