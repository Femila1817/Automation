
public class ThirtyTwoInterfaceMain {

	public static void main(String[] args) {
Kit k  = new Kit();
Writer p = new ThirtyTwoInterfaceC();  //we can create only reference of interface  not the object in interface
Writer pc = new Pencil();

k.doSomething(pc);

		
	}

}
