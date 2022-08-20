package com.example.demo.nullpointer;

import java.awt.Color;
import java.util.HashMap;

import com.example.demo.record2.Grape;

public class NullPointerExceptions {

	/**
	 * 7. NullPointerException com stacktrace melhorado
	 */
	public static void validate() {
		HashMap<String, Grape> grapes = new HashMap<>();
		grapes.put("grape1", new Grape(Color.BLUE, 2));
		grapes.put("grape2", new Grape(Color.WHITE, 4));
		grapes.put("grape3", null);
		@SuppressWarnings("unused")
		var color = ((Grape) grapes.get("grape3")).getColor();
	}
}
