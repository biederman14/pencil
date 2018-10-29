package org.wecancodeit.pencil;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PencilTest {

	Pencil subject;

	@Test
	public void pencilWillWrite() {
		subject = new Pencil();
		subject.write("Hello, World.");
		subject.written();
		assertEquals("Hello, World.", subject.written());
	}

	@Test
	public void pencilWillAddAdditionalWriting() {
		subject = new Pencil();
		subject.write("Hello, World.");
		subject.write("Han shot first!");
		assertEquals("Hello, World.Han shot first!", subject.written());
	}
}
