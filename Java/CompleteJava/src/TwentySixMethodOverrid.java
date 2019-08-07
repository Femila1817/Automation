
public class TwentySixMethodOverrid {
	//int i;
	public void show(){
		System.out.println("In A");
	}

}

class BH extends TwentySixMethodOverrid{  
	//int i;
	//@Override //annotation - used to avoid logical error and gives us compile error
	public void show(){ 																//method overriding
		//super.i = 8; //this means assigning value to the super class variable
		//super.show(); //this is to intentionally call superclass method so this give both class data
		
		/*if we accidentally make mistake in method name. consider here we had given show1() instead of show().
		on execution,it will automatically call default method, since it has show(). so to avoid that, we include @Override.  but since we have given show1(),it will throw error in
		compilation, so we have to rectify it*/ 
	System.out.println("In B");
}
	public void config(){
		System.out.println("config");
	}
}
class C extends TwentySixMethodOverrid
{
	public void show(){    //method overriding
		System.out.println("In C");
	}
}