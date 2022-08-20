package com.example.demo.number;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormattingSupport {

	/**
	 * 8. Uma fábrica foi adicionada ao NumberFormat para formatar números de forma humanamente legível
	 */
	public static void validate() {
		Locale locale = new Locale("pt", "BR");
		//Locale locale = Locale.ENGLISH;
		//Locale locale = Locale.CANADA;
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));
	}
}
