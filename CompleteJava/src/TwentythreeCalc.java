
public class TwentythreeCalc {
	
	/*public int add(int i, int j){
		return i + j;
	}
*/int sum;
	public int add(int ... n){
		for(int i : n){
		 sum= sum + i;
		} 
		return sum;
	}
}
