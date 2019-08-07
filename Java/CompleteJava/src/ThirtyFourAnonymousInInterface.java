interface Abc {
	void show();
}

/*
 * class Implementor implements Abc{//here the only purpose is to implement Abc;
 * how can i move like anonymous in class public void show(){
 * System.out.println("anything"); }
 * 
 * }
 */
public class ThirtyFourAnonymousInInterface {

	public static void main(String[] args) {
		// Abc obj = new Implementor();
		// Abc obj = new Abc(); cannot create it as object cannot be created in
		// interface, since it doesnot have any implementation --> but see

		Abc obj = new Abc() {
			public void show() {
				System.out.println("anything"); 
			}
		};
		obj.show();

	}

}
