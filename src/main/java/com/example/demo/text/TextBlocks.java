package com.example.demo.text;

/**
 * 2. Text Blocks
 * 
 * @author araujo
 */
public class TextBlocks {

	public static void validate() {
		String text = """
				{
					"name": "John Doe",
					"age": 45
				}
				""";
		System.out.println("Rodando Java 17:\n" + text);
	}
}
