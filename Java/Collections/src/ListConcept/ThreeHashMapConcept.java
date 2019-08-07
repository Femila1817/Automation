package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ThreeHashMapConcept {

	public static void main(String[] args) {

		//HashMap is a class implements Map Interface
		//extends AbstractMap
		//contains only unique elements
		//stores the values in the form of key and value pair
		//It may have one null key allowed and multiple null values
		//It maintains no order
		HashMap<Integer, String> hashm = new HashMap<Integer, String>();
		hashm.put(1,"selenium");
		hashm.put(2,"qtp");
		hashm.put(3,"autoit");
		System.out.println(hashm.get(1));
		System.out.println(hashm.get(10)); //no error; gives null
		
		//to print all at once
		
		for(Entry<Integer, String> m : hashm.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		System.out.println(hashm);
		hashm.remove(1);
		
		System.out.println(hashm);
		
		//using employee class
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Jerry",2,"My son");
		Employee e2 = new Employee("Femila",29,"Proud mom");
		Employee e3 = new Employee("Vasantha",55,"Proud Mom's Mom");
		
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee" + key + "Info");
			
			System.out.println(e.name + " : " + e.age + " : " + e.dept);
		}
		
		
		

	}

}
