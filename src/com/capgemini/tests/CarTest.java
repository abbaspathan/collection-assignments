package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Car;

public class CarTest {

	private Car swift;
	private Car audi;
	private Car jaguar;

	@Before
	public void setUp() {

		swift = new Car("Maruti Suzuki", "ZXi", 2016, 435000);
		audi = new Car("Audi", "SDI", 2012, 1254000);
		jaguar = new Car("Jaguar", "XCDI", 2019, 45679800);
	}

	@Test
	public void testToCheckItAcceptDuplicateOrNotForCarClass() {
		HashSet<Car> hashset = new HashSet<Car>();
		Car audi2 = new Car("Audi", "SDI", 2012, 1254000);
		hashset.add(swift);
		hashset.add(audi);
		hashset.add(jaguar);
		hashset.add(audi);
		hashset.add(audi2);
		assertEquals(3, hashset.size());
	}

	@Test
	public void testToCheckCanItStoreDataInOrder() {
		TreeSet<Car> sortset = new TreeSet<Car>();

		sortset.add(swift);
		sortset.add(audi);
		sortset.add(jaguar);

		Iterator<Car> iterate = sortset.iterator();
		assertEquals("Audi", iterate.next().getCarmake());
	}

}
