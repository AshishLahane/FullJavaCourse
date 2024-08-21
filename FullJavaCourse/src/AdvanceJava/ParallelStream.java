package AdvanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {

	public static void main(String[] args) {

		
		int size=100;
		List<Integer> num = new ArrayList<>(100);
		
		Random ran = new Random();
		
		for(int i=1;i<=size;i++)
		{
			num.add(ran.nextInt(50));
		}
		System.out.println("\n" +num);
		
	}

}
