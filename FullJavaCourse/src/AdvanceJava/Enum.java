package AdvanceJava;

// group of constant  (unchangeable variable like final variables)

enum Status{
	
	running, writing, swiming,Reading;
}



public class Enum {

	public static void main(String[] args)
	{
		
		Status a= Status.Reading;    // for specific value
		System.out.println(a);
		
		// for printing all values  
		
		Status[] aa = Status.values();    // need to create array for getting all values,
		
		for(Status s : aa) {
			
			System.out.println(s + " :" + s.ordinal());   // ordinal for getting number of the values 
			
		}
		
	}

}
