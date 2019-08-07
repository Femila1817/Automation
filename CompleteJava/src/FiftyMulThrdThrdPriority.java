// How to set the name thread and set the priorities of the thread

public class FiftyMulThrdThrdPriority {

	public static void main(String[] args) throws Exception { 

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi " + Thread.currentThread().getPriority());
				try { 
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		},"Hi Thread");
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		},"Hello Thread");
		//lets print nameof the thread : by default for 2st thread name will be Thread0 and goes on
		// can we change the thread name? yes we can 
		/*t1.setName("Hi Thread");
		t2.setName("Hello Thread");*/ //to identify the thread when we use multiple thread
		// the name we can give in another way to
		
		/*System.out.println(t1.getName());
		System.out.println(t2.getName());*/
		
		//lets work on priority
		
		//set priority -- with number as priority we wont be able to identify always, so we can change it
				/*t1.setPriority(1);
				t2.setPriority(10);*/
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);  //these are inbuilt priority 
				//is we want to give the priority in the thread itself means..
		/*System.out.println(t1.getPriority()); //[1- least priority , 5 medium priority] - it has 1-10
		System.out.println(t2.getPriority());
		
		
*/
		t1.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start(); 
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println("Bye");
		
	}

}
