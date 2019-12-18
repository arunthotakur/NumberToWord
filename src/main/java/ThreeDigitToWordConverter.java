public class ThreeDigitToWordConverter extends TwoDigitToWordConverter {

	public static final String HUNDRED = "hundred";

	@Override
	public String convert(int n) {
		String result = UNITS[n / NumberToWordConverter.HUNDRED];
		if(!result.contentEquals("")){
			result += NumberToWord.SPACE + HUNDRED;
			if(n % NumberToWordConverter.HUNDRED > 0) {
				result += NumberToWord.SPACE + NumberToWord.AND + NumberToWord.SPACE;
			}
		}
		return result += super.convert(n % NumberToWordConverter.HUNDRED);
	}

}
