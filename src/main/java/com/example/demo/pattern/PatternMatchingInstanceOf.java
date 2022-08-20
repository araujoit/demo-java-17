package com.example.demo.pattern;

import java.awt.Color;

import com.example.demo.record2.Grape;

public class PatternMatchingInstanceOf {
	
	/**
	 * 6. Pattern matching
	 */
	public static void validate() {
		Object o = new Grape(Color.BLUE, 2);
		if (o instanceof Grape grape && grape.getNumOfPits() == 2) {
			System.out.println("Esta fruta tem " + grape.getNumOfPits() + " pits");
		}
	}
}
