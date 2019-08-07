
public class SeventeenStaticClass { //consider it as employee class

	int eid;
	int salary;
	static String ceo; //which is common to all emp
	
	static{ //static block executed,when we load class//if we need to enable static, we can use static block
		ceo ="Larry";
		System.out.println("in static");
	}
	
	public SeventeenStaticClass(){  //constructor is executed,when we create obj.// if we want to initialize non static variable,use constructor
		eid = 1;
		salary = 46545; //here if we consider,emplyee id and salaray are same for both employee
		System.out.println("in constructor");
	}
	
	public void show(){ //method
		System.out.println("The employee details : "+ eid + ":" + salary + ":" +ceo);
	}
}
