package org.wecancodeit.pencil;

public class Pencil {

	String writingAdd = "";

	public void write(String writing) {
		writingAdd += writing;
	}

	public String written() {
		return writingAdd;
	}

}