
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FifNColGenSetInterface {

	public static void main(String[] args) {
		
//		Set<Integer> values = new HashSet<>();//Set itself an interface and it is a part of collection
		//Hashset is a class that implements set
		Set<Integer> values = new TreeSet<>();
//		values.add(5);
//		values.add(6);
//		values.add(9);
//		values.add(6);
		
//		System.out.println(values.add(5));
//		System.out.println(values.add(6));
//		System.out.println(values.add(9));
//		System.out.println(values.add(6)); //ll say false when adding duplicat values
		
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));
		System.out.println(values.add(92)); //prints everything but not in sequence, y it is.?
		
		//HashSet - when put in heapmemory, nearest value will be fetched. of 97 is nearer for it retreive.
		
		//for asc ordr --> use treeset
		
		
		
		for(int i : values) {
			System.out.println(i);
		}
		//what is the diff b/w set and list?
		//list - gives duplicate element too, in Set -> supports only unique element
		
	}

}
