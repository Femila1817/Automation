
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
	int rollno, marks;
	String name;
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	/*
	 * public int compareTo(Stud s) { return marks>s.marks?-1:1; }
	 */
	

	public int compareTo(Stud s) {
		return name.length()>s.name.length()?-1:1;
	}

}
public class FifEiGEnColComparableIntf {

	public static void main(String[] args) {	
		
  		List<Stud> studs = new ArrayList<>(); 
  		
  		studs.add(new Stud(23,"Jerry",98));
  		studs.add(new Stud(24,"Sansa",64));
  		studs.add(new Stud(25,"Ned",45));
  		studs.add(new Stud(26,"Robb",72));
  		studs.add(new Stud(27,"Tomes",85));
  		
  		//shall we sort - through collections it throws error, so how to do
  		//we have to implements a interface - Comparable w/c has 1ly 1 mthod
  		
  		//If in future, we need to change the logic to sort by marks,
  		//we cannot chnge class so we ll do as,
  		
  		Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1);// this will override comparable
  		for(Stud s : studs) {
  			System.out.println(s);
  		}
  		
  		
  		
	} 

}
