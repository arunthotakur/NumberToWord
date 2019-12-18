public class TwoDigitToWordConverter extends SingleDigitToWordConverter {

	private static final String TEN_MULTIPLES[] = { "","", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
			"eighty", "ninety" };
	private static final String TWO_DIGIT_SPECIALS[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
			"seventeen","eighteen","nineteen"};
	
	@Override
	public String convert(int n) {
		String result = TEN_MULTIPLES[n / TEN];
		if(result == "" && n >= 10) 
			return TWO_DIGIT_SPECIALS[n % TEN];
		if(!result.contentEquals("")) {
			if(n % TEN == 0) {
				return result;
			}else {
				return result + " "+super.convert(n % TEN);
			}
		}
		else
			return super.convert(n % TEN);
	}
}
