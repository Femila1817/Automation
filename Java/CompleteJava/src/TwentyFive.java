
public class TwentyFive {

	public static void main(String[] args) {

		TwentyFiveSuper c = new TwentyFiveSuper();
		System.out.println("-------------------------------------------");
		/*If we create the object for super class, we will get the 1st constructor of the super class
	*/
		//now what about b
		
		TwentyFiveSuperOne d =new TwentyFiveSuperOne(); //it gives both superclass constructor and subclass constructor -- this is object without value
		System.out.println("-------------------------------------------");
		
		//if added one more constructor n both the classes
		TwentyFiveSuperOne d1 =new TwentyFiveSuperOne(5); /*calling second constructor -- now ll pass a value in subclass - this calls
		1st constructor from superclass and 2nd constructor fromsub clas.
		this is default java functionality that it will call the default constructor from super class and new construcotr from subclas.
		ideally it should give newly created constructor value*/
		
		//so to get the newly created constructor values
		

	}

}
