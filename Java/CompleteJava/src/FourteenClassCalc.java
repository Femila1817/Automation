public class FourteenClassCalc {

	int num1 ;
	int num2 ;
	int result ; //local variable
	
	public FourteenClassCalc(int num1,int num2){
		
		this.num1 = num1;  //when name is same,you have to specify this keyword,to differentiate frm above
		this.num2 = num2; //instance variable
		
	}
	public FourteenClassCalc(int n, double d){ 
		num1 = (int) d;
		num2 = 5;
		
	}
}
