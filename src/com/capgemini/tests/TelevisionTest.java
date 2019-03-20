package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelevisionTest {

	private static Television onida;
	private static Television redmi;
	private static Television micromax;

	@BeforeClass
	public static void setUp() {
		onida = new Television("ONIDA", "Plasma", false, 20000);
		redmi = new Television("REDMI", "LED", true, 34000);
		micromax = new Television("MICROMAX", "LCD", true, 45000);
	}

	@Test
	public void testToCheckItAcceptDuplicateOrNotForLaptopClass() {
		HashSet<Television> hashset = new HashSet<Television>();

		Television redmi2 = new Television("REDMI", "LED", false, 3400);
		hashset.add(onida);
		hashset.add(redmi);
		hashset.add(micromax);
		hashset.add(redmi);
		hashset.add(redmi2);

		assertEquals(3, hashset.size());
	}
}
