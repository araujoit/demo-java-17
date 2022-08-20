package com.example.demo.dateperiod;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatePeriodSupport {

	/**
	 * 9 A. Pattern B indica o período do dia de acordo com o padrão UNICODE
	 */
	public static void validate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B");
		System.out.println(dtf.format(LocalTime.of(8, 0)));
		System.out.println(dtf.format(LocalTime.of(13, 0)));
		System.out.println(dtf.format(LocalTime.of(20, 0)));
		System.out.println(dtf.format(LocalTime.of(23, 0)));
		System.out.println(dtf.format(LocalTime.of(0, 0)));
	}
	
	/**
	 * 9 B. Pattern B indica o período do dia de acordo com o padrão UNICODE, em um locale específico
	 */
	public static void validateWithLocale() {
		Locale locale = Locale.ENGLISH;
		//Locale locale = new Locale("pt", "BR");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B").withLocale(locale);
		System.out.println(dtf.format(LocalTime.of(8, 0)));
		System.out.println(dtf.format(LocalTime.of(13, 0)));
		System.out.println(dtf.format(LocalTime.of(20, 0)));
		System.out.println(dtf.format(LocalTime.of(23, 0)));
		System.out.println(dtf.format(LocalTime.of(0, 0)));
	}
}
