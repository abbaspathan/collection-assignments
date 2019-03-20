package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Laptop;

public class LaptopTest {

	private static Laptop dellLaptop;
	private static Laptop lenovoLaptop;
	private static Laptop hpLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell", "Inspiron", "Windows 8", "Intel i5");
		lenovoLaptop = new Laptop("Lenovo", "T80-75", "Windows 10", "Intel i3");
		hpLaptop = new Laptop("HP", "Notebook", "Fedora", "AMD");
	}

	@Test
	public void testToCheckItAcceptDuplicateOrNotForLaptopClass() {
		HashSet<Laptop> hashset = new HashSet<Laptop>();
		
		Laptop laptop2 = new Laptop("Dell", "Inspiron", "Windows 8", "Intel i5");
		hashset.add(dellLaptop);
		hashset.add(lenovoLaptop);
		hashset.add(hpLaptop);
		hashset.add(dellLaptop);
		hashset.add(laptop2);

		assertEquals(3, hashset.size());
	}
}
