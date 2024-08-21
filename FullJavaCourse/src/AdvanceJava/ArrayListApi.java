package AdvanceJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApi {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(20);
		num.add(30);
		num.add(20);
		num.size();
		System.out.println("Size of array: "+ num.size());
		System.out.println("Index of :" + num.indexOf(20));
		System.out.println("get value from index num Get method: " +num.get(2));

		System.out.println("\n All array list ");
		for(int n : num) {
		
		System.out.println(n);
		}
		 
	}

}
