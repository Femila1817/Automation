
public class TwoVariable {

	public static void main(String[] args) { 
		
		long l = 5000000; // 8 byte 
		
		int a = 5; //int takes 4bytes ---> 32 bits 
		
		short s = 5; //take only 2 byte. 16 bit. -32768 to 32767
		
		byte b = 5 ; //take only 1 byte. range : -128  to 127
		
		String c = "A";
		
		double d = 5; //double supports integer too, that is called ""implicit conversion"", which will be hcanged to 5.0
		a = 10;
		
		int test = (int)5.6;
		
		System.out.println("The number given is : " + a);
		System.out.println("The number given in test is : " + test); // here 6 is ignored when we assign double variable to integer
// this is called "type casting"  -- ""explicit conversion""
	}

}
