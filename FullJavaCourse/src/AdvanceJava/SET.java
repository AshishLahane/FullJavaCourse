package AdvanceJava;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;



public class SET {
    public static void main(String[] args){   
    	
   	Set<Integer> nums=new HashSet<Integer>();  	
    	//Set<Integer> nums2=new TreeSet<Integer>();
    	//Collection<Integer> nums3=new TreeSet<Integer>();
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);
    	
    	
    	Iterator<Integer> values = nums.iterator();
    	
    	while(values.hasNext())
    		System.out.println(values.next());
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}
    }
}
