package org.wecancodeit.pencil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
}
