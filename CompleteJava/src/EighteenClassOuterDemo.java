/*we can have class inside a class */
public class EighteenClassOuterDemo { // outer class

	static int a; // outer class variable

	public static void show() { // outer class method
		System.out.println("in show");
	}

	class InnerClass { // inner class - name will be
						// "EighteenClassOuterDemo$InnerClass.Class" when we
						// compile the code
		public void display() { // inner class method
			System.out.println("In Display");
		}
	}

}
