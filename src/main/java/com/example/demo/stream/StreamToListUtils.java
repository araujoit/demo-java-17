package com.example.demo.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamToListUtils {

	/**
	 * 10. Adicionado método toList ao Stream
	 */
	public static void validate() {
		Stream<String> stringStream = Stream.of("a", "b", "c");
		List<String> stringList = stringStream.toList();
		for (String s : stringList) {
			System.out.println(s);
		}
	}
}
