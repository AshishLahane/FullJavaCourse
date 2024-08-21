/* 

Types of Interface:-
1. Normal interface
	- an interface having two or more methods
2. Functional interface (SAM)
	- SAM => Single Abstract Method interface
3. Marker interface
	- an interface that as no methods (blank interface)

*/





package AdvanceJava;
interface D
	{
	    void show();
		public void display();
	}
class E implements D{
	public void show() {
		System.out.println("I am from show ");
	}
	public void display() {
		System.out.println("I am fromm display");
	}
}


public class Interface {

	public static void main(String[] args) {

		E obj= new E();
		obj.display();
		obj.show();
	}
}