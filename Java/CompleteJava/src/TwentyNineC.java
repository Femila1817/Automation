
abstract class TwentyNineC { //consider the class as Human  //called abstract class
	// if abstract nobody can create object out of it
	
	public abstract void eat(); //decalre method[not defining] through abstract keyword
	//whenever the declare a method as abstract, the class has to b abstract. this is mandatory

	public void walk(){
		
	}

}
class Man extends TwentyNineC{ //concrete class
	public void eat(){
		
	}
}
