package com.femila.test;

public class THNDemoMain {

	public static void main(String[] args) {
		THNStudent p1 = new THNStudent();
		p1.rollno =9;
		//p1.name = "Femila"; //not visible error is comingup for the private variable in same package
		
		p1.mark = 45; //protected works fine within pacakage
		p1.age = 28; //when tried to access age in same package -- > works fine
	}

}
