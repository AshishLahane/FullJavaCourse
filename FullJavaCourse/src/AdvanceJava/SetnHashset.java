package AdvanceJava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetnHashset {

	public static void main(String[] args) {

		
		
		Set<Integer> num = new TreeSet<Integer>();  // treeset will give in ascending order
		Set<Integer> hash= new HashSet<Integer>();  // hashset will give any sequence order
		
		hash.add(11);
		num.add(10);
		num.add(98);
		num.add(27);
		num.add(91);
		num.add(10);
		num.add(50);
		
		for (int n:num) {
			System.out.println(n);
		}
	}

}
