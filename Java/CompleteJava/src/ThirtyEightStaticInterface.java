//In java 1.8, they have also 

interface dev { // can we have variables in interface.. lets try

	int i = 89; // it is compulsory to initialize the variable,else it will
				// throw error

	void abc();

	static void show() { // to call this method, we need to create a class, they
							// create the object then we need to call the method
		System.out.println("hi"); // to cut this long method, from java 8 we
									// have an option .. this is
	} // weneed to use the keyword "static" in the method,instad of 'default
		// void show'
}

class devImp implements dev {
	public void abc() {
		// i = 9; //it throws error saying final variable cannot be changed..
		// Means any variable,declared in interface becomes "final"
	} // even if we dnt write the word final
}

public class ThirtyEightStaticInterface {

	public static void main(String[] args) {

		dev.show(); // and we can call like this,instead of creating lenghty
					// process of object creation

	}

}
