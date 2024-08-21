package CoreJava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {55,34,45};					//when we know the values for the array
		int num2[]= new int[5];					// when we know the only size of array
		num2[0]=11;
		num2[1]=22;
		num2[2]=33;
		
		
		System.out.println(num[1] + " \n");
		
		//for printing array one by one it will become tricky or lenthy 
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2] + "\n");
		
		// then we use for loop for printing array one by one it will become tricky or lenthy 

			for(int i=0;i<4;i++)
			{
					System.out.println( num2[i]);
			}
		
	}

}
