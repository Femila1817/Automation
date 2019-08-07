//Is-a , HAS- A

//dog is a animal ;dog extends animal
//bathroom has a tub



public class TwentyFourInheritance {  //differnet class name with same parameters
	public int add(int i, int j){
		return i+j;
	}

}
class TwentyFourInhClass2 extends TwentyFourInheritance{ //inheritance. Subclass has 2 mthods, 1 frommain class and 2nd from sub class. [here both add and sub]
	public int sub(int i,int j){
		return i-j;  //subclass1 from superclass
	}
}


/*----single level inheritance---*/

class TwentyFourInhClass3 extends TwentyFourInhClass2{  //multilevel inheritance - subclass 2 from subclass1
	public int multiply(int i,int j){
		return i *j;
	}
}