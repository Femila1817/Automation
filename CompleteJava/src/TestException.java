
public class TestException extends Exception {

	public TestException(String s) {
		super(s); //this to ge the desired msg
	} // this is the newly creating own exception -->but still not giving the desired msg. 

	// SO HOW TO map this string to get that msg :super comes here
}
