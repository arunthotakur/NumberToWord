public class SingleDigitToWordConverter implements NumberToWordConverter {

	public static final String UNITS[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" };

	public String convert(int n) {
		// TODO Auto-generated method stub
		return UNITS[n];
	}

}
