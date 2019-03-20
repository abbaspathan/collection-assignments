package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhoneTest {

	private static CellPhone vivo;
	private static CellPhone nokia;
	private static CellPhone samsung;

	@BeforeClass
	public static void setUp() {
		vivo = new CellPhone("VIVO","VIVO V5","4GB RAM,32BG Internal","Android",22000);
		nokia = new CellPhone("NOKIA","NOKIA 108","1GB RAM No Internal","Window",3400);
		samsung = new CellPhone("SAMSUNG","SAMSUNG J2","4GB RAM 16GB Internal","Android",16000);
	}

	@Test
	public void testToCheckItAcceptDuplicateOrNotForLaptopClass() {
		HashSet<CellPhone> hashset = new HashSet<CellPhone>();

		CellPhone samsung2 = new CellPhone("SAMSUNG","SAMSUNG J2","4GB RAM 16GB Internal","Android",16000);
		hashset.add(vivo);
		hashset.add(nokia);
		hashset.add(samsung);
		hashset.add(vivo);
		hashset.add(samsung2);

		assertEquals(3, hashset.size());
	}

}
