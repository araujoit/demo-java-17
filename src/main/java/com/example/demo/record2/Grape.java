package com.example.demo.record2;

import java.awt.Color;
import java.util.Objects;

public class Grape {
	private final Color color;
	private final int numOfPits;
	
	public Grape(Color color, int numOfPits) {
		this.color = color;
		this.numOfPits = numOfPits;
	}

	public Color getColor() {
		return color;
	}

	public int getNumOfPits() {
		return numOfPits;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, numOfPits);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grape other = (Grape) obj;
		return Objects.equals(color, other.color) && numOfPits == other.numOfPits;
	}

	@Override
	public String toString() {
		return "Grape [color=" + color + ", numOfPits=" + numOfPits + "]";
	}
}
