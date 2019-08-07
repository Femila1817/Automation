import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FortyTHRExHanWithResource {

	public static void main(String[] args) throws Exception {
		int n = 0;
		System.out.println("Enter a number : ");
		//BufferedReader br = null;    //always we use try,catch & finally for exception. what if we remove catch?
									// bcos "Finally" is there. What if we remove "finally?" -->throws eror
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			//br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		/*}  finally {  //here we use finally not to handle exception, but to close the resource
			br.close(); // so, even if we get an exception above, resource will be closed */
			System.out.println("closed"); //in and from java 1.7, it is not necessary to give finally compulsory. 
		}//we can give in try, give () and define the object there itself
		
		//If given like this,it will close the resource automatically
		System.out.println(n);

	}

}

