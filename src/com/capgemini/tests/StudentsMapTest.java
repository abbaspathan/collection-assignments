package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.StudentsMap;

public class StudentsMapTest {

	private static StudentsMap krishna;
	private static StudentsMap arif;
	private static StudentsMap abbas;
	private static StudentsMap pradnya;

	@BeforeClass
	public static void setUp() {

		krishna = new StudentsMap("krishna", 23);
		arif = new StudentsMap("arif", 33);
		abbas = new StudentsMap("abbas", 53);
		pradnya = new StudentsMap("pradnya", 21);
	}

	@Test
	public void testStudentKeyGivesValueOfFruit() {
		HashMap<String, String> hashset = new HashMap<>();
		hashset.put(krishna.getStudentName(), "mango");
		hashset.put(arif.getStudentName(), "orange");
		hashset.put(abbas.getStudentName(), "grape");
		hashset.put(pradnya.getStudentName(),"mango");

		assertEquals("mango", hashset.get(krishna.getStudentName()));
		assertEquals("mango", hashset.get(pradnya.getStudentName()));
		assertEquals("grape", hashset.get(abbas.getStudentName()));
	}
}
