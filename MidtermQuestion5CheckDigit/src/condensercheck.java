import static org.junit.Assert.*;

import org.junit.Test;


public class condensercheck {

	@Test
	public void testLuhnDigitCompresor() {
		assertSame("does not compress properly", 9 , CreditCardCheckDigit.LuhnDigitCompresor(18));
	}

}
