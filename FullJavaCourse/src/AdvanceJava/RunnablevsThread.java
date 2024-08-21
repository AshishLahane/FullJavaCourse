package AdvanceJava;

// runnable is an interfce who can describe a class whose interface can be run as a thread 


//class T5 implements Runnable 
//	{	
//		public void run()
//			{
//			for(int i=0;i<=5;i++) 
//				{
//					System.out.println("Hiii");
//					try {Thread.sleep(10);} catch (InterruptedException e) {	e.printStackTrace(); }
//				}
//			}
//	
//}

class T6 implements Runnable
{
		public void run()
		{
		for(int i=0;i<=5;i++) 
			{
				System.out.println("Hello");
				try {Thread.sleep(10);} catch (InterruptedException e) {	e.printStackTrace(); }
			}
		}
}


public class RunnablevsThread {

	public static void main(String[] args) {

		
		Runnable obj1= ()->{
		for(int i=0;i<=5;i++) 
			{
				System.out.println("Hiii");
				try {Thread.sleep(10);} catch (InterruptedException e) {	e.printStackTrace(); }
			}
		};  
		
		Runnable obj2= new T6();   //// reference of interface object of class
		
		Thread T1= new Thread(obj1);
		Thread T2= new Thread(obj2);
		
		T1.start();    
		T2.start();

	}

}
