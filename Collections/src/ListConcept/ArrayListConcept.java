package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

int a[] = new int[3];//static array		

ArrayList<Comparable> al = new ArrayList<Comparable>();

al.add(10);
al.add(20);
al.add(30);
		
		System.out.println("Array size : " +al.size());
		
		
		
		al.add(40);
		al.add(50);
		al.add(50);
		System.out.println("Array List ------->" +al.size()); //size of array
		
		al.add(12.33);
		al.add("test");
		al.add("TRUE");
		
		System.out.println(al.get(4));//to get the value from an index
		
		//to print all the values from array list
		
		for(int i=0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
		
		
		//imp : non generics and generic
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();  //allow to add one and only integer
		//ar.add("test"); ->will through error
		al1.add(45);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("test");
		
		ArrayList<E> al3 = new ArrayList<E>(); //when the data type s unknown
		
		//Employee class objects
		
		Employee e1 = new Employee("Jerry",2,"IAS");
		Employee e2 = new Employee("Femila",29,"QA");
		Employee e3 = new Employee("vasantha",55,"Boss");
		
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>(); //if we need to add the employee objects
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		
		
		System.out.println("_________________________________________________________________");
		//****************************
		
		//addall()
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("seleniun");
		ar5.add("qtp");
		
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("qa");
		ar6.add("support");
		ar6.add("support");
		
		ar5.addAll(ar6);
		for(int i =0 ; i< ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		
		//remove array
		
		ar5.removeAll(ar6);
		
		System.out.println("__________________________________");
		
		for(int i =0 ; i< ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//retain all
		
		
		System.out.println("************************************************");
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("dev");
		ar7.add("qa");
		ar7.add("support");
		
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("dev");
		ar8.add("php");
		ar8.add("pub");
		
		ar7.retainAll(ar8);
		

		for(int i =0 ; i< ar7.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
