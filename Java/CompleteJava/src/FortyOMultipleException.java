public class FortyOMultipleException {

	public static void main(String[] args) {
		try {
			// int t[] = new int[6]; lets change this to create another
			// exception - last steps
			int t[] = null; // giving arry as nul and accessing values - gives
							// nullpointexception.. so can create a catch.. if
							// itkeeps continuting,what to do,, so it is always
							// bettter to give the only exception without any
							// specification
			t[5] = 8; // ==>works fine
			t[6] = 5; // what if i try to access variable, which is nt availalbe
						// in array? throws error in compilation
			int a = 7;
			int b = 0;
			int c = a / b;
			System.out.println("the output is  : " + c);

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by Zero"); // now give proper
															// error msg
		} catch (ArrayIndexOutOfBoundsException e) { // we can have multiple
														// catch in java || we
														// can write multiple
														// exception in 1 catch
			System.out.println("Stay in yourlimit :)"); // here, both gives
														// error, can we
			// reduce it
		} // insteadof getting 2 catch msg,we get 1, eventhough 2 exception
			// happen. bcos, array method is throwing error first,so it direclty
			// goes to the respective catch msg and ignore others -> so
			// whichever expection coming first will ignore others

		/*
		 * catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ //this
		 * introduces in 1.7 System.out.println("Error"); }
		 */
		catch (Exception e) { // error goes to all the above exception,try to
								// matches it,if matched,displays
								// corresponding,if not display this.
			System.out.println("Some error occured.."); // if we put this in the
														// initial itslef, it
														// will throw err for
														// others.bcos this
														// handles every err
		} // this always has to be in the end

		finally {
			System.out.println("Bye");
		}

	}

}
