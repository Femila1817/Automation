import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FortyTwoCheckedException {

	public static void main(String[] args) throws Exception{ //throws Exception { // if we remove this, throws
																// Exception, it says
																// unhandled i/o exception
int n = 0;
		System.out.println("Enter a number : "); //either use try catch or use in main clas.lets ctry catch

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// lets change thistoo
		
		BufferedReader br = null; //any class which come with io[check import] are "resource". so v should always close it after use.
		try{
		br = new BufferedReader(new InputStreamReader(System.in)); 
		//int n = Integer.parseInt(br.readLine());
		 n = Integer.parseInt(br.readLine()); //if we get exception here, resource ll not get closed
		 //br.close(); so alwys give close in finally block
		}
		catch(Exception e){
			System.out.println(e);
		}finally{
			br.close(); //using exception in main class
		}
		System.out.println(n);

	}

}
