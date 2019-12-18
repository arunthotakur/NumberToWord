import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.*;

public class NumberToWordTest {

	@Test
	public void convertSingleDigitNum() throws NumberNotInRangeException {
		assertEquals("one",new NumberToWord().convert(1));
		assertEquals("nine",new NumberToWord().convert(9));
	}
	
	@Test
	public void convertTwoDigitNum() throws NumberNotInRangeException {
		assertEquals("ten",new NumberToWord().convert(10));
		assertEquals("eleven",new NumberToWord().convert(11));
		assertEquals("nineteen",new NumberToWord().convert(19));
		assertEquals("fifty seven",new NumberToWord().convert(57));
		assertEquals("ninety nine",new NumberToWord().convert(99));
	}
	
	@Test
	public void convertThreeDigitNum() throws NumberNotInRangeException {
		assertEquals("one hundred",new NumberToWord().convert(100));
		assertEquals("one hundred and one",new NumberToWord().convert(101));
		assertEquals("one hundred and ten",new NumberToWord().convert(110));
		assertEquals("two hundred and twenty one",new NumberToWord().convert(221));
		assertEquals("nine hundred and ninety nine",new NumberToWord().convert(999));
	}
	
	@Test
	public void convertFourDigitNum() throws NumberNotInRangeException {
		assertEquals("one thousand",new NumberToWord().convert(1000));
		assertEquals("one thousand one",new NumberToWord().convert(1001));
		assertEquals("one thousand ten",new NumberToWord().convert(1010));
		assertEquals("one thousand one hundred and one",new NumberToWord().convert(1101));
		assertEquals("one thousand one hundred and ten",new NumberToWord().convert(1110));
		assertEquals("two thousand nineteen",new NumberToWord().convert(2019));
		assertEquals("nine thousand nine hundred and ninety nine",new NumberToWord().convert(9999));
	}
	
	@Test
	public void convertFiveDigitNum() throws NumberNotInRangeException {
		assertEquals("ten thousand",new NumberToWord().convert(10000));
		assertEquals("ten thousand one",new NumberToWord().convert(10001));
		assertEquals("ten thousand twenty one",new NumberToWord().convert(10021));
		assertEquals("ten thousand three hundred and twenty one",new NumberToWord().convert(10321));
		assertEquals("fourteen thousand three hundred and twenty one",new NumberToWord().convert(14321));
		assertEquals("twenty thousand three hundred and one",new NumberToWord().convert(20301));
		assertEquals("thirty thousand one",new NumberToWord().convert(30001));
		assertEquals("fifty five thousand six hundred and one",new NumberToWord().convert(55601));
	}
	
	@Test
	public void convertSixDigitNum() throws NumberNotInRangeException {
		assertEquals("one hundred thousand",new NumberToWord().convert(100000));
		assertEquals("one hundred thousand one",new NumberToWord().convert(100001));
		assertEquals("one hundred thousand eleven",new NumberToWord().convert(100011));
		assertEquals("one hundred thousand one hundred and twenty one",new NumberToWord().convert(100121));
		assertEquals("four hundred and fifty six thousand seven hundred and one",new NumberToWord().convert(456701));
		assertEquals("three hundred and one thousand twenty",new NumberToWord().convert(301020));
		assertEquals("five hundred thousand one hundred and two",new NumberToWord().convert(500102));
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine",new NumberToWord().convert(999999));
	}
	
	@Test
	public void convertSevenDigitNum() throws NumberNotInRangeException {
		assertEquals("one million",new NumberToWord().convert(1000000));
		assertEquals("one million one",new NumberToWord().convert(1000001));
		assertEquals("three million four hundred and fifty six thousand seven hundred and eighty nine",new NumberToWord().convert(3456789));
		assertEquals("one million two hundred thousand one hundred and twenty three",new NumberToWord().convert(1200123));
		assertEquals("one million two thousand three hundred and fourty five",new NumberToWord().convert(1002345));
		assertEquals("one million ten thousand two hundred and thirty",new NumberToWord().convert(1010230));
	}
	
	@Test
	public void convertEightDigitNum() throws NumberNotInRangeException {
		assertEquals("ten million",new NumberToWord().convert(10000000));
		assertEquals("eleven million one",new NumberToWord().convert(11000001));
		assertEquals("eleven million ten",new NumberToWord().convert(11000010));
		assertEquals("eleven million eleven",new NumberToWord().convert(11000011));
		assertEquals("twenty five million three hundred and fourty five thousand six hundred and seventy eight",
				new NumberToWord().convert(25345678));
		assertEquals("ten million eleven thousand one",new NumberToWord().convert(10011001));
		assertEquals("ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				new NumberToWord().convert(99999999));
	}
	
	@Test
	public void convertNineDigitNum() throws NumberNotInRangeException {
		assertEquals("one hundred and eleven million ten",new NumberToWord().convert(111000010));
		assertEquals("one hundred and eleven million eleven",new NumberToWord().convert(111000011));
		assertEquals("one hundred and twenty five million three hundred and fourty five thousand six hundred and seventy eight",
				new NumberToWord().convert(125345678));
		assertEquals("one hundred and ten million eleven thousand one",new NumberToWord().convert(110011001));
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",new NumberToWord().convert(999999999));
	}
	
	@Test
	public void testNumberInRange() {
		assertEquals(false, new NumberToWord().isWithinRange(-1));
		assertEquals(false, new NumberToWord().isWithinRange(0));
		assertEquals(true, new NumberToWord().isWithinRange(12345));
		assertEquals(true, new NumberToWord().isWithinRange(98765432));
		assertEquals(false, new NumberToWord().isWithinRange(1234567890));
	}
	
}
