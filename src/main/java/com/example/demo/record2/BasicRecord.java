package com.example.demo.record2;

import java.awt.Color;

public class BasicRecord {

	/**
	 * 4 A. Records
	 */
	public static void validate() {
		GrapeRecord grape1 = new GrapeRecord(Color.GRAY, 1);
		GrapeRecord grape2 = new GrapeRecord(Color.CYAN, 2);
		System.out.println("Grape 1 é " + grape1);
		System.out.println("Grape 2 é " + grape2);
	}
	
	/**
	 * 4 B. Records
	 */
	public static void validate2() {
		record GrapeRecord1(Color color, int numOfPits) {
			GrapeRecord1 {
				System.out.println("Parameter color=" + color);
				System.out.println("Parameter numOfBits=" + color);
				if (color == null) {
					throw new IllegalArgumentException("Color não pode ser nulo");
				}
			}
		}

		GrapeRecord1 grape1 = new GrapeRecord1(Color.BLUE, 1);
		System.out.print("=>Grape1:" + grape1);

		GrapeRecord1 grape2 = new GrapeRecord1(Color.YELLOW, 2);
		System.out.print("=>Grape2:" + grape2);

		GrapeRecord1 grapeNull = new GrapeRecord1(null, 3);
		System.out.print("=>GrapeNull:" + grapeNull);
	}
}
