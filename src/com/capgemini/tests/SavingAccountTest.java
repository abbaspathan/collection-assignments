package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.SavingAccount;

public class SavingAccountTest {

	private static SavingAccount account1;
	private static SavingAccount account2;
	private static SavingAccount account3;
	private static SavingAccount account4;
	private static SavingAccount account5;

	@BeforeClass
	public static void setUp() {

		account1 = new SavingAccount("krishna", 102, 20000, true);
		account2 = new SavingAccount("arif", 103, 43000, false);
		account3 = new SavingAccount("aayush", 104, 34000, true);
		account4 = new SavingAccount("abbas", 105, 59000, false);
		account5 = new SavingAccount("aasif", 101, 34567, false);
	}

	@Test
	public void testArrayListContainAllTheObjects() {

		ArrayList<SavingAccount> arraylist = new ArrayList<SavingAccount>();

		arraylist.add(account1);
		arraylist.add(account2);
		arraylist.add(account3);
		arraylist.add(account4);
		arraylist.add(account5);

		assertEquals(5, arraylist.size());
	}

	@Test
	public void testForStoringAccountDetailsInUniqueAsEntity() {

		TreeSet<SavingAccount> treeset = new TreeSet<SavingAccount>();
		SavingAccount account6 = new SavingAccount("aasif", 101, 34567, false);
		treeset.add(account1);
		treeset.add(account2);
		treeset.add(account3);
		treeset.add(account4);
		treeset.add(account5);
		treeset.add(account6);
		treeset.add(account4);

		assertEquals(5, treeset.size());

		Iterator<SavingAccount> iterator = treeset.iterator();

		assertEquals(account5, iterator.next());
	}
}
