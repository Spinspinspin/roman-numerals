package com.liberymutual.goforcode.romanNumerals.services;

import java.util.ArrayList;
import java.util.Arrays;

public class HinduToRomanNumeralConverter {

	
		public String convert(int number) {
			String roman = "";
			ArrayList<String> firstDigit = new ArrayList<>(Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX"));
			ArrayList<String> secondDigit = new ArrayList<>(Arrays.asList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX","XC"));
			ArrayList<String> thirdDigit = new ArrayList<>(Arrays.asList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC","CM"));
			ArrayList<String> fourthDigit = new ArrayList<>(Arrays.asList("", "M", "MM", "MMM", "MMMM"));
			
			roman = fourthDigit.get(number%10000/1000) + thirdDigit.get(number%1000/100) + secondDigit.get(number%100/10) + firstDigit.get(number%10);
	
		return roman;
	}
	
	
	
}
