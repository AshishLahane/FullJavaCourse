package AdvanceJava;

//divide your task in multiple things and working in parallel
//use extend Thread for use thread
//start is a method belongs to thread class 
//you need to be (run()) method in subclass for use start(); in  object
// try catch block is for getting order in sequence   hi hello hi hello

class T3 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=50;i++) 
		{
			System.out.println("Hiii");
			
				
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {	e.printStackTrace(); }
					
				
		}
	}
}
	
class T4 extends Thread{
		
		public void run()
		{
			for(int i=0;i<=50;i++) 
			{
				System.out.println("Hello");
				
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {e.printStackTrace();}
			}
		
	
		}
}
public class ThreadPrioritySleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T3 obj1= new T3();
		T4 obj2= new T4();
		
		obj1.start();    ////start is a method belongs to thread class start(); use for the multithread work in parallel..
		
		try {
			Thread.sleep(5);					// type Thread.sleep(); it will automatically give you full try catch block 
		} catch (InterruptedException e) 
		{			e.printStackTrace();	}  /*try catch block if getting some hello hello in sequence by default 
												for this use try catch block in object creation*/
		obj2.start();
		
	}

}

