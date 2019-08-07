import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FifSixGenCollExTwo {

	public static void main(String[] args) {
		
		
  		List<Integer> values = new ArrayList<>(); 
//		values.add(4);
//		values.add(8);
//		values.add(6);
//		values.add(2,2); //wat 2 do, 2 get o/p in asc odr
  		//lets have values as,
  		
  		values.add(404);
  		values.add(908);
  		values.add(639);
  		values.add(265); //if we want to sort the number based on last number

  		Collections.sort(values);
	Collections.reverse(values); // to reverse
//Hence list is bedefault mutable
		
		Collections.shuffle(values);
  		
  		
  		
  		
  		
		for(Integer o : values) {
			System.out.println(o);
		}
		
	} 

}
