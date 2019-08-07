class Counter{
	int count;
	public synchronized void increment(){
		count++;
	}
}
public class FiftyOneMulThrdSyncKeyword {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		/*c.increment();//since we are calling increment once,it is printing once..
		c.increment();*/ 
		//now lets increase the count to 1,000.. instd of doing it like this,will count using thread
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 1; i <= 1000; i++){
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i = 1; i <= 1000; i++){
					c.increment();
				}
			}
		});
		t1.start(); //will start the increment//but gives count : 0,y? 
					//but if we keep runing somewhr we will get value,that v can see
					//t1 is busy n increasing the count but main thread does nothing.
		//so will ask main threadtowait,till t1 completes
		
		t2.start();
		
		t1.join(); //give exception in main method
				// after this count gets proper
		t2.join();
				//lets initiate 2nd thread - we dnt get the proper 2000.. this is bcos,
		//t1 and t2 runs simultaneously as give req to increment method and gets the same count
		
		// we need to make both t1 and t2 should not interfere others counter execution
		///acheive it by adding synchronized word in the increment method -- now getting proper value
		
		System.out.println("Count : " +c.count); 
		
	}

}
