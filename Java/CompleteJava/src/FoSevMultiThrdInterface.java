
class Chill implements Runnable{ //Runnable is a functional interface --> it hasonly onemethod that is run
			public void run(){ 
		for(int i = 1; i <= 5; i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}		
	}
	}


class Cool extends Thread{
	
		public void run(){ 
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){} 
		}
	}
}
public class FoSevMultiThrdInterface {

	public static void main(String[] args) {  
		
		/*Chill obj1 = new Chill();
		Cool obj2 = new Cool();*/
		
		Runnable obj1 = new Chill();
		Runnable obj2 = new Cool();
		/*Thread t1 = new Thread();
		Thread t2 = new Thread();*/
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();//change this to// //	obj1.start();//1 issue, we dnt have start method any where. so how to get!!!
						//instead of calling start through obj.. we can call as
		
		
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start(); //obj2.start();  but throws error. so link obj with thread, through changing the reference and object

	}

}
