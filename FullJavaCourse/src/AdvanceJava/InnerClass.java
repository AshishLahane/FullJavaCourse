package AdvanceJava;

//Inner class is a class that is defined inside another class .
///// non static nested classes are called inner class 



class A{
	
	public void show() {
		System.out.println("In void show from main class A ");
	}
	
	
	class B{
			public void subB() {
				System.out.println("From sub class of b from the main class A ");
			}
	}
	
	static class C{
		public void subC() {
				System.out.println("This is sub class of classs  c from class a ");
		}
	}
}



public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj= new A();
		obj.show();
		
		A.B obj1= obj.new B();   // can't create direct object of sub class so 1st need to create obj of class then create from sub class 
		obj1.subB();
		
		A.C obj2 = new A.C();  // if class is static then we can create object directly ;;;
		obj2.subC();
		

	}

}
