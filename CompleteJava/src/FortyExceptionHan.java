
public class FortyExceptionHan {

	public static void main(String[] args) {
		try {
			int a = 7;
			/* if */ int b = 0; // --> it directly goes to catch and not
								// executing the o/p statment //int b = 2;
								// /works fine
			int c = a / b;
			System.out.println("the output is  : " + c);
			// System.out.println("Bye"); // -->what if i need to display this,
			// even after getting exception //so i
			// will clone this in catch block

			int i = 9 / 0; // when execute, gets error as arithmetic exception
							// in the o/p v can c, as soon as exception comes
							// up, it
							// breaks the code and not going further.so we need
							// to
							// handle the exception. through try catch
		} catch (ArithmeticException e)// we can also give specific
										// exception or general,catch(Exception
										// e) // try
										// --> a block were we put the
										// statement. if try throws
										// exception,its our responsibility
										// tocatchit
		{
			System.out.println("Error");
			// System.out.println("Bye"); //so we do code redundancy.. so we ill
			// use other that is finally block
			// System.err.println("Error"); //to display the error in red color
		}
		// System.out.println("Bye"); //lets put this is in try block
		finally {
			System.out.println("Bye"); // prints,if we get / not get exception
		}

	}

}
