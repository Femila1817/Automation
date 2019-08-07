interface Writer{ //class Writer{
	void write(); /*public void write() --> instead of declaring empty function we can define the function
	{
		
	}
	*/
}
class ThirtyTwoInterfaceC implements Writer{ //extends Writer{ //consider it is clss pen
	public void write(){
		System.out.println("I am a Pen");
	}

}


class Pencil implements Writer{ //extends Writer{
	public void write(){
		System.out.println("I am a Pencil");
	}
	
}

class Kit{
	public void doSomething(Writer P){
		P.write();
		
	}
}

