
public class SeventeenStaticEx {
	static int i = 10;
	public static void main(String[] args) {
		i = 9; //if removed static from above variabledeclaration and change the number here,it will throw an eror
		//basically, non static variable, cannot be called in static method
		SeventeenStaticClass yesdani = new SeventeenStaticClass(); //employee femila & yesdani
		/*yesdani.eid = 8;
		yesdani.salary = 50000;
		SeventeenStaticClass.ceo = "Mahesh";
		*/
		SeventeenStaticClass femila = new SeventeenStaticClass();
		/*femila.eid = 2;
		
		femila.salary = 50010;
		SeventeenStaticClass.ceo = "Mahesh";
		
		SeventeenStaticClass.ceo = "Nikitha"; */
		
		/*changing ceo name, since both are working in same company,and mentioned as static in class,it has to change for both the employee
		 * If the value is static,it is not neccessary to mention the object. as like femila.salary,we can mention the class name
		 * as SeventeenStaticClass.ceo
		 * but both obj and class name usage will work
		*/
		
		yesdani.show();
		femila.show();
		
	}

}
