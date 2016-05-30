package chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tax1913Test {

	@Test
	public final void testCalculateTax() {
		Tax1913 t = new Tax1913(500000);
		assertEquals(20250, t.calculateTax(), 0);
		
		
	}
}
