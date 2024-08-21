package AdvanceJava;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args)
	{

		
		List<Integer> num = Arrays.asList(2,4,5,7,8,9,22);
		
		
		
		int result = num.stream()
						 .filter(n->n%2==1)
						 .map(n->n*2)
						 .reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		
		
		
		// this is using normal stream 
//		Stream<Integer> s1 = num.stream();
//		Stream<Integer> s2 = s1.filter(n->n%2==1);
//		Stream<Integer> s3 = s2.map(n-> n*2);
//		
//		s3.forEach(n-> System.out.println(n));
		
		
		
		
		
		// by using for loop
		System.out.println("\n \n BY using normal for loop");
		for( int n : num )
		{
			if(n%2==0) 
			{
				System.out.println( n);
			}
		}		
	}

}
