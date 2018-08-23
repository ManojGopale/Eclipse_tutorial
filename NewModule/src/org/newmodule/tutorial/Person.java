package org.newmodule.tutorial;

public class Person {
	//fields
	private String name;
	private int maximumBooks;
	
	//constructor
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}
	
	public int getMaxBooks() {
		return maximumBooks;
	}
	
	public void setMaxBooks(int maxBooks) {
		maximumBooks = maxBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaxBooks() + " books)";
	}
}
