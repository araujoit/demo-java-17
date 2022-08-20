package com.example.demo.switchexpressions;

public class SwitchExpressions {

	/**
	 * 3 A. Switch Expressions
	 * @param fruit
	 */
	public static void validate(String fruit) {
		String result = switch (fruit) {
		case "Orange" -> "Laranja";
		case "Banana" -> "Banana";
		default -> "Fruta não definida";
		};
		System.out.println(result);
	}
}
