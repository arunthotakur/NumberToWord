public class MillionConverter{
	
	public static final String MILLION = "million";
	
	public String convert(int n) {
		String result = new ThreeDigitToWordConverter().convert(n / NumberToWordConverter.MILLION);
		return result + NumberToWord.SPACE + MILLION;
	}

}
