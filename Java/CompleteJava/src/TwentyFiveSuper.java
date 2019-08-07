
class TwentyFiveSuper {

	public TwentyFiveSuper() {
		System.out.println("in A");
	}

	public TwentyFiveSuper(int i) {
		System.out.println("in A in");   //super() - super method
	}
}

class TwentyFiveSuperOne extends TwentyFiveSuper 
{
	public TwentyFiveSuperOne()
	{
		super(4); //every constructor has the default super keyword,eventhough we dont mention,that is y it always calls superclass default constructor
		//mention any number in super, to call 2nd constructor of superclass and 1st constructor of subclass
		System.out.println("in B");
	}
		public TwentyFiveSuperOne(int i) 
		{
			super(i);//but if we mention the integer in super, it will call the corresponding constructor from the super class
			System.out.println("in B in");
		}
}