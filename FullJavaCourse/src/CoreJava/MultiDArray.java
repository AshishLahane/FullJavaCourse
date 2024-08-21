package CoreJava;

//array of array is multi dimensional array

public class MultiDArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int array[][] = new int[3][4];			// size of column and row 
		
		
		System.out.println(array[2][3]);		// for simply print by size 
		
		// for printing full array use for loop
		
		for (int i =0; i<3;i++)
		{
			for(int j=0; j<4;j++)
			{
			System.out.print(array[i][j] + " ");     //" " used for in one line 
			}
			System.out.println();
		}

	}

}
