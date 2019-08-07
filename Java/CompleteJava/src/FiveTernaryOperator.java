
public class FiveTernaryOperator {

	//ternary operator 
	// ?: -> condition?expr1:expr2
	public static void main(String[] args) {
		
		int i = 8;
		int j =  0;
		
		/*if (i > 6) 
			j = 1;
		else
			j = 2;
*/
		j = (i>6)?1:2; // i > 6 print 1, else print 2 == > ternary operator
		System.out.println(j);
	}

}
