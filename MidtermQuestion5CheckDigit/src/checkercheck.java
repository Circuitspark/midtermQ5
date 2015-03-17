import static org.junit.Assert.*;

import org.junit.Test;


public class checkercheck {

	@Test
	public void testLuhnChecker() {
		assertTrue("valid card number fails", CreditCardCheckDigit.LuhnDigitCompresor(4879347211027980));
	}

}
