package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




class Student{
	
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ConstructorReference {

	public static void main(String[] args) {

		
		List<String> names = Arrays.asList("John", "Kiran", "Raja");
		
		List<Student> students = new ArrayList<>();
		
		
		for (String name : names) {
			students.add(new Student(name, 01));
			
		}
		
		
		students = names.stream().map(name-> new Student(name, 10)).collect(Collectors.toList());
		
		System.out.println(students);

	}

}
