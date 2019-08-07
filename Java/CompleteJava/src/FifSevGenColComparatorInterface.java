
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FifSevGenColComparatorInterface {

	public static void main(String[] args) {	
		
  		List<Integer> values = new ArrayList<>(); 
  		
  		values.add(404);
  		values.add(908);
  		values.add(639);
  		values.add(265); //if we want to sort the number based on last number just by "sorting"
  		
  		//so we use "COMPARATOR"
  		 //cannot here object for interface so wll create class, interface and then create object
  		//OR -- use anonymous class
//  		Comparator<Integer> c = new Comparator<Integer>() {
//  			public int compare(Integer i, Integer j) {
////  				if(i%10 > j%10)
////  					return -1;
////  				else
////  					return 1; //instead we can use ternary operator
//  				
//  				return i%10 > j%10 ? -1:1;
//  				//y v use 1 & -1 ? 1 -> swap the element ; -1 > dnt swap the element bsd n cndtn
//  			}
//  		}; 
  		
  	//wat abt lambda exprsn

  		
  		//Comparator<Integer> c = (i, j) ->  i%10 > j%10 ? -1:1; also can use in
  		
  		//Collections.sort(values, c);  replace the above value in c
  		Collections.sort(values, (i, j) ->  i%10 > j%10 ? -1:1);  
  		
		for(Integer o : values) {
			System.out.println(o);
		}
		
	} 

}

