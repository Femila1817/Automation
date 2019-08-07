//constructor overloading
public class SixteenClassCasio {
	
	int num1;
	int num2;
	String operation;
	public SixteenClassCasio(){
		num1 = 0;
		num2 = 0;
		operation = "nothing";
	}
	
	public SixteenClassCasio(int i){
		num1 = i;
		num2 = 0;
		operation = "nothing";
	}
public SixteenClassCasio(int i,int j){
	num1 = i;
	num2 = j;
	operation = "nothing";
		
	}
public SixteenClassCasio(int i,int j,String op){
	num1 = i;
	num2 = j;
	operation = op;
		
	}

}
