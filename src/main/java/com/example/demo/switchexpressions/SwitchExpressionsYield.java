package com.example.demo.switchexpressions;

public class SwitchExpressionsYield {

	/**
	 * 3 B. Switch Expressions com Yield
	 * @param fruit
	 */
	public static void validate(String fruit) {
		String resultYield = switch (fruit) {
		case "Orange":
			yield "Laranja";
		case "Banana":
			yield "Banana";
		default:
			yield "Fruta não definida";
		};
		System.out.println(resultYield);
	}
}
