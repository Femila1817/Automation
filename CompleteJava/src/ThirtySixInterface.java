//Abstract Class ---> Define method and declare method
//Interface ---> only Declare method ; no definition   ---> this was only till 1.7 

//1.8 we can define method in  interface

// we dont have much difference now with interface and abstract class

// for defining a method we need to use the keyword "Default"

// unable to create object -- > still continues
@FunctionalInterface //functional interface has only one abstract method. Hence here,it doesnot throw error bcos
					// both the methods are different : one is declared and one is defined
interface Demo{
	void abc();
	default void show(){
		System.out.println("in show");
	}
}

class DemoImp implements Demo{
	public void abc(){
		System.out.println("in abc");;
		
	}
	public void show(){
		System.out.println("In New Show");   //is method overriding possible for this method declared in interface
	}  										// Yes it is possible
}
public class ThirtySixInterface {

	public static void main(String[] args) {
		
		Demo d = new DemoImp();
		d.abc();
		d.show();
		
	}

}
