package org.wecancodeit.pencil;

public class Pencil {

	private String writingAdd = "";
	private int pointDurability;

	public Pencil(int startingDurability) {
		pointDurability = startingDurability;
	}

	public void write(String writing) {
		// substring is counting every character up until it hits the pointDurability
		// number and then stops
		int limit = Math.min(pointDurability, writing.length());
		int blankSpaces = Math.max(writing.length() - limit, 0);

		writingAdd += writing.substring(0, limit);
		writingAdd += addPadding(blankSpaces);
	}

	private String addPadding(int blankSpaces) {
		String paddingString = "";
		for (int padding = 0; padding < blankSpaces; padding++) {
			paddingString += " ";
		}
		return paddingString;
	}

	public String written() {
		return writingAdd;
	}

}