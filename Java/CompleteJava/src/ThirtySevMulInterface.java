	interface Test {
	void abc();

	default void show() {
		System.out.println("in show");
	}
}

interface MyTest { // new interface
	default void show() {
		System.out.println("in MyTest show"); // we can remove it if we have
												// same method in the Base
												// interface
		// here we have show() method in implemented class. but the show in main
		// interface is already overridden which is already overiding the method
		// in the main interface, so we cna ignore
		// if we specify it will be ambiguity issue // this is one way
		// another method of this is,[2]
	}
}

class TestImp implements Test, MyTest { // class implements 2 interface
	public void abc() {
		System.out.println("in abc");

	}

	public void show() {
		// System.out.println("In DemoImp Show"); //[2] if we want to show the
		// super interface method data, we can mention it as super
		Test.super.show(); // is method overriding possible// // Yes it is
							// possible, for this method declared in interface
		MyTest.super.show(); // here both calls the respective method of
								// respective interface

	}
}

public class ThirtySevMulInterface {

	public static void main(String[] args) {

		Test d = new TestImp();
		d.abc();
		d.show();

	}

}
