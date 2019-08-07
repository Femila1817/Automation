
public class ThirtyAbstractCExam {  //consider this to printer
	/*public void show(Integer i){
		System.out.println(i);
		
	}
	public void show(Double i){
		System.out.println(i);
		
	}
	
	*here we are using same printlin state, to get same i. so can we change this?*/
	
	public void show(Number i){  //bcause Integer class and Double class extends Number class
		System.out.println(i);
	}

}
