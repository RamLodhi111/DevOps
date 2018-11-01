package com.java.main;
public class NumberWords {

	
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};	
	
	
	public String toWords( int number ) {
	if (number < 0) {
		return "Minus " + toWords(-number);
	}

	if (number < 20) {
		return units[number];
	}

	if (number < 100) {
		return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
	}

	if (number < 1000) {
		return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + toWords(number % 100);
	}

	if (number < 100000) {
		return toWords(number / 1000) + " Thousand" + ((number % 10000 != 0) ? " " : "") + toWords(number % 1000);
	}

	if (number < 10000000) {
		return toWords(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " : "") + toWords(number % 100000);
	}

	return toWords(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " : "") + toWords(number % 10000000);
}
	
}