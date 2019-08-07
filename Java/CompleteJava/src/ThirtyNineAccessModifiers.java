//2package == > 1. default pacakge 2. com.femila.test [package inside com.femila]

//import com.femila.test.*; //either can import whole package 
import com.femila.test.THNStudent; //or the specific class

public class ThirtyNineAccessModifiers {

	public static void main(String[] args) {
		THNStudent p1 = new THNStudent(); // initially we got error to create object,
									// when the class file in different package
									// & main filein diff package
		// to resolve this, we need to import the package
		p1.rollno = 9; // Now lets assign value to the roll no --> says,
						// student.roll no not visible
 // to fix this,we need to assign public to the variable in the class file
		
		//p1.mark(); //protected throws error in diffrent package -->lets create another class in com.femila
		
		//p1.age = 45; //throws error in diff package
}
}