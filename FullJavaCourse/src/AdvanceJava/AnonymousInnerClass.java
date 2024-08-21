package AdvanceJava;

// Anonymous class is a class in main method 


class z{
	public void subclass()
	{
			System.out.println("subclass of A");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args)
	{
		
		z object = new z()
		{
		public void subclass()				//this is Anonymous Inner class class which is in main class 
		{
				System.out.println("NEW FROM THE MAIN CLASS");
		}
	};
	object.subclass();
	}
		
		
	}


