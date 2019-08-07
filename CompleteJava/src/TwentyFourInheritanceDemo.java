
public class TwentyFourInheritanceDemo {  //used two class for performing fcuntions separately.. can we use the 1st class to do multiple action
// here comes inheritance
	public static void main(String[] args) {
		TwentyFourInheritance c = new TwentyFourInheritance();
		int result = c.add(5, 10);
		System.out.println("result : "+ result);
		//FourteenInhClass c1 = new FourteenInhClass();
		TwentyFourInhClass2 c1 = new TwentyFourInhClass2();
		TwentyFourInhClass3 c2 = new TwentyFourInhClass3();
		
		int result1 = c1.add(5,15);
		int result2 = c1.sub(5,15);
		int result3 = c2.multiply(5, 10);
		
		
		System.out.println("result1 : "+ result1);
		System.out.println("resultsub : "+ result2);
		System.out.println("resultmultiply : "+ result3);

	}

}
