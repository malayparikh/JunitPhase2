package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertionTests {

	@Test
	public void testAssertEquals() {

		assertEquals(5, 2 + 3, "5 should be equal to the sum of 2 and 3");

	}

	@Test
	public void testAssertNotEquals() {

		assertNotEquals(5, 3 + 3);
	}

	@Test
	public void testAssertTrue() {

		assertTrue(3 > 2);

	}

	@Test
	public void testAssertFalse() {

		assertFalse(2 > 3);
	}

	@Test
	public void testAssertNull() {

		String str = null;

		assertNull(str, "str should be null");

	}

	@Test
	public void testAssertNotNull() {

		String str = "Junit";

		assertNotNull(str);
	}

	@Test
	public void testAssertArrayEquals() {

		int[] expected = { 1, 2, 3 };
		int[] actual = { 1, 2, 3 };

		assertArrayEquals(expected, actual, "The array should be equal");
	}

	@Test
	public void testAssertSame() {

		String str1 = "Junit5";
		String str2 = "Junit3";

		assertSame(str1, str2);
	}

}
