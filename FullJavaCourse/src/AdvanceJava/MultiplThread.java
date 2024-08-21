package AdvanceJava;

/*
 divide your task in multiple things and working in parallel
use extend Thread for use thread
start is a method belongs to thread class 
you need to be (run()) method in subclass for use start(); in  object*/


class T1 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=200;i++) 
		{
			System.out.println("Hiii");
		}
	}
}
	
class T2 extends Thread{
		
		public void run()
		{
			for(int i=0;i<=100;i++) 
			{
				System.out.println("Hello");
			}
		
	
		}
}
public class MultiplThread {

	public static void main(String[] args) {
		
		T1 obj1= new T1();
		T2 obj2= new T2();
		
		obj1.start();    //start is a method belongs to thread class start(); use for the multi thread work in parallel..
		obj2.start();
		
	}

}
