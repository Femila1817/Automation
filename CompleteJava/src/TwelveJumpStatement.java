
public class TwelveJumpStatement {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i ++){
			
			
			if (i == 6){
				continue; //skip  the number alone. skip the iteration. skiploop.
			}
			if(i == 8)
				break; //skip the number and later data. break the loop
			System.out.println("The value is" + i);
		}

	}

}
