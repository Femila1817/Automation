package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class FourHashTableConcept {

	public static void main(String[] args) {

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Jerry");
		h1.put(2, "Java");
		h1.put(3,"sel");
		
		//create a clone copy/shallow copy
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();	
		h2 = (Hashtable<Integer, String>) h1.clone();
		
		System.out.println("The values from h1 : "+h1);
		
		System.out.println("The values from h2 : "+h2);
		
		h1.clear();
System.out.println("The values from h1 : "+h1);
		
		System.out.println("The values from h2 : "+h2);
		
		//contains value method
		
		
		
		Hashtable<String, String> h3 = new Hashtable<String, String>();
		
		h3.put("A", "Jerry");
		h3.put("B", "MAnager");
		h3.put("C", "Very good");
		
		if(h3.contains("Jerry")) {
			System.out.println("Value is available");
			
		}
		
		
		//print all values from hashtable using the concept called enumeration 
		//1 mthod is there, Enumeration---> elements()
		
		Enumeration<String> e = h3.elements();
		System.out.println("Print values from H3 using enumeration");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//can also get using entry set
		
		
		System.out.println("Print values from H3 using entry set");
		
		Set<?> s = h3.entrySet();
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
