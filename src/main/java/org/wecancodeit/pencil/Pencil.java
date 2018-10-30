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
			int blankSpaces = writing.length() - pointDurability;
			for (int padding = 0; padding < blankSpaces; padding++) {
				writingAdd += " ";
			}
		} else {
			writingAdd += writing;
		}
	}

	public String written() {
		return writingAdd;
	}

}