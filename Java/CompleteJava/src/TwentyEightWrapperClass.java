
public class TwentyEightWrapperClass {

	public static void main(String[] args) {

		int i = 5; //primitive data type - normal variable
		Integer i1 = new Integer(5); //wrapper class - storing it in object > which happen though class. for int, the class is Integer. 
		//both this and above line has same functionality
		
		Integer i2 = new Integer(i); // i -> primitive; when given primitive in object ==> it is called "boxing" - wrapping
		
		int j = i2.intValue(); //taking out the value from object is called ==> "unboxing"  - unwrapping
		
		Integer value = i; // we do like this also => auto boxing
		
		int k = value ; //auto unboxing
		
		//primitive works faster than wrapper class.
		//certain frameworks , like hibernate works only with wrapper class.. so we use it
		String str = "123";
		int s = Integer.parseInt(str);
		


	}

}
