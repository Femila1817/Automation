
public class EighteenClassInnerDemo {

	public static void main(String[] args) {
		EighteenClassOuterDemo obj = new EighteenClassOuterDemo();
		obj.show();
		EighteenClassOuterDemo.InnerClass obj1 = obj.new InnerClass(); //accesstype
		/*Inorder to call as inner class - we need to use the outer class. 
		 * Inorder to call the constructor[right side]/create a object - we need to use the object of the outer class*/
		obj1.display();
		//EighteenClassOuterDemo.InnerClass obj2 = new EighteenClassOuterDemo.InnerClass();	if we class is static,we have to use this method	
		
	}

}
