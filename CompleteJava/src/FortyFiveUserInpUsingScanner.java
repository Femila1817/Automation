import java.util.Scanner;

public class FortyFiveUserInpUsingScanner {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt(); //nextIn() fetch the input,..string,integer
		System.out.println("The entered Number is : " +n);
	}

}
