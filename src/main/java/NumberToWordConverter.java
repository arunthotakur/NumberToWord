public interface NumberToWordConverter {
	
	public static final int TEN = 10;
	public static final int HUNDRED = 100;
	public static final int THOUSAND = 1000;
	public static final int MILLION = 1000000;
	
	public static final String AND = "and";
	public static final String SPACE = " ";
	
	public String convert(int n) throws NumberNotInRangeException ;
}
