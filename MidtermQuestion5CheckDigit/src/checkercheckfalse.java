import static org.junit.Assert.*;

import org.junit.Test;


public class checkercheckfalse {

	@Test
	public void testLuhnChecker() {
		assertFalse("does not return false on improper card number", CreditCardCheckDigit.LuhnDigitCompresor(1111111111111111));
	}

}
