public class ThousandConverter extends ThreeDigitToWordConverter{
		
	public static final String THOUSAND = "thousand";
	
	@Override
	public String convert(int n) {
		String result = new ThreeDigitToWordConverter().convert(n / NumberToWordConverter.THOUSAND);
		return result + NumberToWord.SPACE + THOUSAND;
	}


}
