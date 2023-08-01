package Flyweight;

import java.util.ArrayList;

public class Number {
	private ArrayList<Digit> digitList = new ArrayList<Digit>();

	public Number(int number) {
		String strNum = Integer.toString(number);
		int len = strNum.length();

		DigitFactory digitFactory = new DigitFactory();
		for (int i=0;i<len;i++) {
			int n = Character.getNumericValue(strNum.charAt(i));
			Digit digit = digitFactory.getDigit(n);
			digitList.add(digit);
		}
	}

	public void print(int x, int y) {
		int cntDigits = digitList.size();
		for (int i=0;i<cntDigits;i++) {
			Digit digit = digitList.get(i);
			digit.print(x+(i*6), y);
		}
	}
}
