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
		if (writing.length() > pointDurability) {
			String subWriting = writing.substring(0, pointDurability);
			writingAdd += subWriting;
			// this creates the blank spaces and adds it to the end of writingAdd
			writingAdd += addPadding(writing);
		} else {
			writingAdd += writing;
		}
	}

	private String addPadding(String writing) {
		String paddingString = "";
		int blankSpaces = writing.length() - pointDurability;
		for (int padding = 0; padding < blankSpaces; padding++) {
			paddingString += " ";
		}
		return paddingString;
	}

	public String written() {
		return writingAdd;
	}

}