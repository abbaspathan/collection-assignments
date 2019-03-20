package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.School;

public class SchoolTest {

	private static School school1;
	private static School school2;
	private static School school3;

	@BeforeClass
	public static void setUp() {
		school1 = new School("GSMCOE", "Pune", "Pune", 238);
		school2 = new School("COE", "Mumbai", "Mumbai", 876);
		school3 = new School("PCCOE", "Jamkhed", "Nager", 2456);
	}

	@Test
	public void testToCheckItAcceptDuplicateOrNotForSchoolClass() {
		HashSet<School> hashset = new HashSet<School>();

		School school = new School("PCCOE", "Jamkhed", "Nager", 2456);
		hashset.add(school1);
		hashset.add(school2);
		hashset.add(school3);
		hashset.add(school1);
		hashset.add(school);

		assertEquals(3, hashset.size());
	}
}
