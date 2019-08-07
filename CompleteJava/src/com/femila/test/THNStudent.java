package com.femila.test;

public class THNStudent {
	
	int age = 27;
	
	
	public int rollno = 8; // initially bydefault all the variable created are
							// private
	// to the package. lets create 1 more class in the same
	// package and the acces it without giving public.. it will
	// work fine for all inside and outside package

	private String name = "Jerry"; // lets have one more variable as private
									// ->try to access on same package - throws
									// error, bcos we cannot access the private
									// in the same package itself
	
	protected int mark; //works fine within pacakge

}
