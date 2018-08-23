package org.newmodule.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaxBooks());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Manoj");
		assertEquals("Manoj", p2.getName());
	}

	public void testSetMaxBooks() {
		Person p3 = new Person();
		p3.setMaxBooks(73);
		assertEquals(73, p3.getMaxBooks());
	}
	
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Manoj Gopale");
		p4.setMaxBooks(7);
		
		String testString = "Manoj Gopale (7 books)";
		assertEquals(testString, p4.toString());
	}

}
