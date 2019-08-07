import java.util.ArrayList;
import java.util.List;

public class FifFivGenColl {

	public static void main(String[] args) {
		
		//if we want a list of elments, that should be of specific datatype
		// for the above we use generic //normal arry will be int a[]
		
  		//List<Integer> values = new ArrayList<Integer>(); // this isolder version
  		//now it is not mandatory to give integer on both side, 1 side enough
  		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(8);
		values.add(2,2);
		
		//values.add(5.5);
		//values.add("String"); both gets error wen we add integer
		
		//have to specify the same in retreiving too
		for(Integer o : values) {
			System.out.println(o);
		}
		
	} 

}
