public class NumberNotInRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Number not in range of 1 and 999999999";

	@Override
	public String toString() {
		return MESSAGE;
	}
}
