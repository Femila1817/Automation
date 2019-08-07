class A {
	public void show() {
		System.out.println("in A Show");
	}
}

/*
 * class B extends A { public void show() { System.out.println("im the best"); }
 * }
 */
// If a method is used, only to override a another method, we can use other
// option ->anonymous class
public class ThirtyThreeAnonymousClass {

	public static void main(String[] args) {

		// A obj = new A(); // change it to
		A obj = new A() {
			public void show() // --> anonymous class, which doesnot have name,
								// but does only method overriding
			{
				System.out.println("im the best"); // we cannot reuse it
			}
		};
		obj.show(); // if i don't want to print "in A show"

	}

}
