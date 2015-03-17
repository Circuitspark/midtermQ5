import java.util.Scanner;

public class CreditCardCheckDigit {

	private String StringNum;
	private int digit1;
	private int digit2;
	private int digit3;
	private int digit4;
	private int digit5;
	private int digit6;
	private int digit7;
	private int digit8;
	private int digit9;
	private int digit10;
	private int digit11;
	private int digit12;
	private int digit13;
	private int digit14;
	private int digit15;
	private int digit16;
	private int checkdigit;
	private int sum;
	private String checkdigitstring;
	private static int cardnumber;

	public static int LuhnDigitCompresor(int a) {
		if (a > 9) {
			String compresorstring = "" + a;
			int compressora = Character.getNumericValue(compresorstring.charAt(0));
			int compressorb = Character.getNumericValue(compresorstring.charAt(1));
			return (compressora + compressorb);
		} else {
			return a;
		}

	}

	public Boolean LuhnChecker(int card) {
		StringNum = Integer.toString(card);
		digit1 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(0)));
		digit2 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(1)));
		digit3 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(2)));
		digit4 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(3)));
		digit5 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(4)));
		digit6 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(5)));
		digit7 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(6)));
		digit8 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(7)));
		digit9 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(8)));
		digit10 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(9)));
		digit11 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(10)));
		digit12 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(11)));
		digit13 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(12)));
		digit14 = LuhnDigitCompresor(Integer.valueOf(2 * StringNum.charAt(13)));
		digit15 = LuhnDigitCompresor(Integer.valueOf(StringNum.charAt(14)));
		digit16 = Integer.valueOf(StringNum.charAt(15));
		sum = (digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7
				+ digit8 + digit9 + digit10 + digit11 + digit12 + digit13
				+ digit14 + digit15);
		checkdigitstring = String.valueOf(sum);
		checkdigit = Integer.valueOf(checkdigitstring.charAt(checkdigitstring
				.length()));

		if (checkdigit == digit16) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean scanning = true;

		while (scanning == true) {
			System.out.print("Enter Credit Card Number For Validation: ");
			cardnumber = input.nextInt();
			break;
		}
		System.out.print("Checking card number: " +cardnumber);
		input.close();
	}

	{
		if (LuhnChecker(cardnumber)) {
			System.out.print("Card Number Is Valid");
		} else {
			System.out.print("Card Number Is Invalid");
		}
	}
}
