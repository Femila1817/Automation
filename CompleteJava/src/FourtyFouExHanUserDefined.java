//how to create our own exception
public class FourtyFouExHanUserDefined {

	public static void main(String[] args) {
		
		int i,j;
		i = 8;
		j = 9; //now if j=9, the k value will be 0. i dont want hat, so wat o do
		
		try{
			int k = i/j;
			if(k == 0){
				//throw new Exception(); //so if we there is no actual exception, you can call exception
			throw new TestException("What to do we got err");	//now if we want to generate our own exception --> throws error -> so lets create it
			}
			
		}catch(TestException e){
			//System.err.println("Error" + e); //+ e = gives exception details. if we need to display user defined msg
			System.out.println("Error :" +e.getMessage()); //and write the msg in created exception
		}													//throws err to create a constructor,lets create it

	}

}
