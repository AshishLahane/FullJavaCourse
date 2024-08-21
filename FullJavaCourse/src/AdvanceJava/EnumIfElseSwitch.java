package AdvanceJava;


enum Final {
	Running, swim, read;
}




public class EnumIfElseSwitch  {

	public static void main(String[] args) {
		
		Final f= Final.read;
//		System.out.println(f);
		
		if(f == Final.read)
			System.out.println("RIght");
	
		else if(f==Final.Running)
			System.out.println("Try Again");
		
		else if(f==Final.swim)
			System.out.println("Wait");
		
		else
			System.out.println("RIght");

	}

}
