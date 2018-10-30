package org.wecancodeit.pencil;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PencilTest {

	Pencil subject;

	@Before
	public void setUp() {
		subject = new Pencil(50);
	}

	@Test
	public void pencilWillWrite() {
		subject.write("Hello, World.");
		subject.written();
		assertEquals("Hello, World.", subject.written());
	}

	@Test
	public void pencilWillAddAdditionalWriting() {
		subject.write("Hello, World.");
		subject.write("Han shot first!");
		assertEquals("Hello, World.Han shot first!", subject.written());
	}

	@Test
	public void pencilGoesDull() {
		subject = new Pencil(10);
		subject.write("seedpuppies?");
		assertEquals("seedpuppie  ", subject.written());
	}
}
