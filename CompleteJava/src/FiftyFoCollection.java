import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FiftyFoCollection {

	public static void main(String[] args) {
  
		//Collection values = new ArrayList();
		List<Comparable> values = new ArrayList<Comparable>(); //list has index number, which we can add any no in btwn
		values.add(4); //[0] // this is Integer not int. ->wrapperclass
		values.add(6); //[1]
		values.add(8);   // [2] //one more problesm
		values.add(2,2);//need to add this b4 8, cant doe this, for this instd of collection intrfce ll use list intrface
		//System.out.println(values); // pritn all the values 
		//in collecetion - index doesnot work, like we cannot call value[0]
		//spl interface call --> iterator to achieve it
		values.add(5.5); //obj of double
		values.add("String"); //object of string
		
		/*Iterator it = values.iterator();
		
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next()); System.out.println(it.next());
		  // when called again gives "Bad words" :) since value NA ==> will chnge this
		
		 * int i = 0; while(i<=values.size()) { System.out.println(it.next());
		 * 
		 * }
		 // throws error again -> so will use the below
		
		while(it.hasNext()) { //checks , do we have next element
			System.out.println(it.next());
		} */
		//since list support index, we can use for loop, instd of iterator
		
		/*
		 * for(int i = 0; i <= values.size(); i++) { System.out.println(values.get(i));
		 * }
		 */ 
		//can we support enhanced for loop 
		
		// here is there is nothing as int, double, string etc, everything values are object. so in 
		//enhanced for loop, we have to give Object datatype
		for(Object o : values) {
			System.out.println(o);
		}
		
	} 

}
