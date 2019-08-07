//Method Overloading - same method name only the diff parameters
public class FifteenClassCasio {
	
	public void add(int i, int j){ // method with 2 value
		System.out.println(i+j);
	}
	public void add(int i, int j,int k){  //same method name with multiple value
		System.out.println(i+j+k);
	}
	public void add(double i, double j){ //same method name with different datatype
		System.out.println(i+j);
	}

}
