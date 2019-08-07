
public class NineteenArray {

	public static void main(String[] args) {

		/*int num[] = new int[4];
		
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		//num[4] = 4;
		 
*/		
		
		int num[] = {8,12,45,99};
		num[2] = 99;
 		//System.out.println("the numbr is" + num[4]); //error bcos, we have given till a[3] only as array size
	//	System.out.println("The number is" + num[2]);
		
		/*OR*/
		for(int i = 0; i <=3 ; i++){
			System.out.println("the numbers are" + num[i]);
		}
		
	}

}
