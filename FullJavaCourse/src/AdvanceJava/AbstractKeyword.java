package AdvanceJava;


// abstract keyword is used to declare a class or method that is incomplete and can't intantiated on it's own


abstract class car {
	
	
	public abstract void drive();
	
	public void music() {
		
		System.out.println("Play music");
	}
	
}

class Maruti extends car{

	public void drive() {
		
		System.out.println("Maruti Class extended from car class");
	}
	
}


public class AbstractKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car function = new Maruti();   //new car car is abstract class so we can't create the object of the abstract class so 
									   // new maruti is extended class of abstract car
		function.music();
		function.drive();

	}

}
