package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Students;

public class StudentsTest {

	private static Students aayush;
	private static Students krishna;
	private static Students pradnya;

	@BeforeClass
	public static void setUp() {

		aayush = new Students("Aayush", 23, "Computer", "Male");
		krishna = new Students("Krishna", 12, "Mechanical", "Male");
		pradnya = new Students("Pradnya", 22, "Civil", "Female");
	}

	@Test
	public void testForCheckingItMaintainInsertionOrderOrNot() {
		ArrayList<Students> arraylist = new ArrayList<Students>();

		arraylist.add(aayush);
		arraylist.add(krishna);
		arraylist.add(pradnya);

		Iterator<Students> iterate = arraylist.iterator();

		assertEquals(aayush, iterate.next());

		iterate.hasNext();

		assertEquals(krishna, iterate.next());

		iterate.hasNext();

		assertEquals(pradnya, iterate.next());
	}

	@Test
	public void testForCheckingItMaintainNaturalOrderOrNot() {

		TreeSet<Students> treeset = new TreeSet<Students>();

		treeset.add(aayush);
		treeset.add(krishna);
		treeset.add(pradnya);

		Iterator<Students> iterate = treeset.iterator();

		assertEquals(krishna, iterate.next());
		
		iterate.hasNext();

		assertEquals(pradnya, iterate.next());

		iterate.hasNext();

		assertEquals(aayush, iterate.next());
	}
}
