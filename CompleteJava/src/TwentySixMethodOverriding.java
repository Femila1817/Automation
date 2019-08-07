
public class TwentySixMethodOverriding {
	
//compile time and runtime polymorphism	

	public static void main(String[] args) {
	
		BH obj1 = new BH();
		obj1.show();
		
		//now if i create an object as, = object reference is super class and object is sub class
		System.out.println("-------------------------------------------------------------------");
		TwentySixMethodOverrid obj2 = new BH();  //this linking one ref and new object will happen at run time only
		// here only those methods whichever in class a will work..if we have extra in B, it wont
		obj2.show(); //so this also decided at runtimeb------> runtime polymorphism
		//-- this will call show from subclass as the object belongs to subclass
		
		System.out.println("-------------------------------------------------------------------");
		
		obj2 = new C(); //reference is still a
		obj2.show(); //since we are changing the method and reference,it s called "dynamic method dispatch"
	}

}
