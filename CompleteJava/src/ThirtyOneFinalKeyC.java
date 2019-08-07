
public class ThirtyOneFinalKeyC { //to disallow, inheritence -- > final public class ThirtyOneFinalKeyC
	//final int DAY = 0; //used to define constnt value --> constant name will bein caps --> with variable
	//public ThirtyOneFinalKeyC(){
		
		//DAY = 10;
		//DAY = 20; - cannot changeit .
		
	//}
	public void show(){ //to disallow override -> public final void show()
	System.out.println("in show");
	}

}
/*class C extends ThirtyOneFinalKeyC{
	public void show(){
		System.out.println("in B Show"); //method overriding a method --> if we need to disallow method override we need to 
		//give final in base method
	}
	

}
*/