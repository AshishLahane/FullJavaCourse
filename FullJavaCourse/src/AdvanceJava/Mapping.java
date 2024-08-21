package AdvanceJava;

import java.util.HashMap;

public class Mapping {

	public static void main(String[] args) {

		
		HashMap<String, Integer> student= new HashMap<>();
		
		student.put("Ashish",200);
		student.put("Navin",100);
		student.put("John",300);
		student.put("Jerry",80);
		student.put("Jerry", 400);
		
		for(String name : student.keySet())
		{
			System.out.println(name +" :" +student.get(name));		
		}
	}

}
