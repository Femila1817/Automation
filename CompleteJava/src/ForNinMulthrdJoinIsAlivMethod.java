//after printing all,i want to print "bye" so lets write a print statement in the last

public class ForNinMulthrdJoinIsAlivMethod {

	public static void main(String[] args) throws Exception { 

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});

		t1.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start(); //one more wecan use is alive,b4 join
		
		System.out.println(t1.isAlive());// to check whther t1 is alive 
										// this has to b executed b4 join.. not after..
		//ifafter, it will throwfalse as it is already joined themain thread
		t1.join();//both completes and once done,joins in main thread.. it will throw excpetion so handle in main class
		t2.join();
		System.out.println("Bye");//but bye scoming in the second itself.. hw to handle this
							//main thread isdoing nothing and t1 nad t2 are printed by Thread method
							// so main says, i dnt have job, let me print "bye".. sowe should askmain to wait, 
							//till thr1 and thr2 completes.. how to do. we can use "join"
		
	}

}
