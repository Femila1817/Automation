//Types of Interface
//1.Normal - More than one method
//2. Single Abstract Method  -  (SAM Interface - to remember)  - > called "functional Interface" - if v know this, v can use lambda interface
//3. Marker Interface - it does not have any method

@FunctionalInterface //it is not compulsory
interface Testing {
	void show();
}

public class ThirtyFiveLambdaInterface {

	public static void main(String[] args) {

		/*Testing obj = new Testing() {
			public void show() {
				System.out.println("anything");
			}
		};*/
		
		Testing obj = () -> System.out.println("anything"); // we have remove the above anonymous class by mentioning like this, 
		
		obj.show();

	}

}
