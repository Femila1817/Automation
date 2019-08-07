//1. reduce number of lines used
//2. make the code more efficient using less no.oclass



/*class relax implements Runnable{ //only purpose of the class is to use runnable and it is used once.soy tovcreate separatly
			public void run(){ //sowill use anonymous class
		for(int i = 1; i <= 5; i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}		
	}
	}
*/

/*class rest extends Thread{
	
		public void run(){ 
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){} 
		}
	}
}*/
public class ForEitMultiThrdIntLambda {

	public static void main(String[] args) {  
		
		/*relax obj1 = new relax();
		rest obj2 = new rest();*/
		
	/*	Runnable obj1 = new relax(){
			public void run(){ //sowill use anonymous class
			*/		
					/*Runnable obj1 = () -> //lambda exprsn
					{
					for(int i = 1; i <= 5; i++){
					System.out.println("Hi");
					try{Thread.sleep(500);}catch(Exception e){}
				}		
			};*/
			/*}*/
	
		/*Runnable obj2 = new rest(){
		public void run(){*/ 
			/*Runnable obj2 = () ->  // obj1 & obj2 we are using only once..so we can give it in the  object itself
			{
			for(int i = 1; i <= 5; i++){
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e){} 
			}
		};*/
		/*}*/
		/*Thread t1 = new Thread();
		Thread t2 = new Thread();*/
/*		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);*/
		
		Thread t1 = new Thread(() ->
		{
			for(int i = 1; i <= 5; i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}		
	});
		Thread t2 = new Thread(() ->
		{
			for(int i = 1; i <= 5; i++){
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e){} 
			}
		});
		
		t1.start();//change this to// //	obj1.start();//1 issue, we dnt have start method any where. so how to get!!!
						//instead of calling start through obj.. we can call as
		
		
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start(); //obj2.start();  but throws error. so link obj with thread, through changing the reference and object

	}

}
