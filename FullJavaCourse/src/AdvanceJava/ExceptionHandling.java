package AdvanceJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* use try catch block for the exception handling when you think statement will give some error or tricky
   then use it in try catch block
   catch block works only when getting exception error otherwise execute correct statement  */
		
		//int i=0;
		int j=0;
		
		try 
		{
			j=18/0;
		}
		
		catch (Exception e)
		{
			System.out.println("Somethinf wrong");
		}
		
		System.out.println(j);
		
		
	}

}
