class Hi extends Thread{ //to run paralelly,make extends thread in class --> which doesnot give the expected o/p 
	//so we have to start the thread in main thread
	//public void show(){
			public void run(){ //changing show to run
		for(int i = 1; i <= 5; i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}//wait for 500 millisecond -- it throws exception so use try catch
		}		//so here,wen 1 mthod is executing other methods arewaiting. how toexecute parallel. means execute alternate
	}
	}

//run is the internalmethod of Thread. when both schdeuler,reaches the system schdeuler at any point of time together, sys will 
//choose which one to run in a random manner, so it can print any statement twice continuously, instead of alternate
// to avoid that we, can add delay in start

//we have an issue here,issue is,
class Hello extends Thread{
	//public void show(){
		public void run(){ //changing show to run
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){}   //wait for 1/2  second b4 printing every statement
		}
	}
}
public class FourtySiMultitthreading {

	public static void main(String[] args) {  // main thread  -- this default
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		obj2.start();  //this start method,internally calls run method,so we have to change then show() to run()
		//obj1.show();
		//obj2.show(); //disable this,as we have changed it to run

	}

}
