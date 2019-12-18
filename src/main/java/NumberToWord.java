public class NumberToWord implements NumberToWordConverter{
	
	private static final int LOWER_LIMIT = 1;
	private static final int UPPER_LIMIT = 999999999;
	
	public boolean isWithinRange(int n) {
		return !(n < LOWER_LIMIT || n > UPPER_LIMIT );
	}

	public String convert(int n) throws NumberNotInRangeException {
		
		//checks whether the num is in range
		if(!isWithinRange(n)) {
			throw new NumberNotInRangeException();
		}
		
		if (n / TEN == 0) {
			return new SingleDigitToWordConverter().convert(n);
		}else if (n / HUNDRED == 0) {
			return new TwoDigitToWordConverter().convert(n);
		}else if (n / THOUSAND == 0) {
			return new ThreeDigitToWordConverter().convert(n);
	    }else if(n / THOUSAND < 1000) { 
	    	String res =  new ThousandConverter().convert(n);
			return (n % THOUSAND == 0) ? res : res + NumberToWord.SPACE + convert(n % THOUSAND);
		}else  {
			String res =  new MillionConverter().convert(n);
			return (n % MILLION == 0) ? res : res + NumberToWord.SPACE + convert(n % MILLION);
		}
	}
			
}
