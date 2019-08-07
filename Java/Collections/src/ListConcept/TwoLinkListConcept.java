package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class TwoLinkListConcept {

	public static void main(String[] args) {


		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		ll.add("RFT");
		
		//print
		System.out.println("Contents of Linklist" + ll);
		
		//addfirst
		ll.addFirst("Jerry");
		
		//addlast
		ll.addLast("My dear son");
		System.out.println("Content of list" +ll);
		
		//get the value
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		ll.set(0, "Femila");
		System.out.println(ll.get(1));
		
		
		//remove 1st and last element
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
		//remove specific position
		ll.remove(3);
		System.out.println(ll);
		
		
		//how to print all the values of linklist
		//1. for loop
		//2. advanced for loop
		//3. iterator
		//4. while loop
		
		System.out.println("*************using for loop**********");
		
		for(int i = 0; i < ll.size(); i++)
			System.out.println(ll.get(i));
		
		System.out.println("*************using advanced for loop************");
		for(String str : ll) {
			System.out.println(str);
			
		System.out.println("*************unsing iterator***************");
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		System.out.println("****************usning while loop***************");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
			
		}
		}

	}

}
