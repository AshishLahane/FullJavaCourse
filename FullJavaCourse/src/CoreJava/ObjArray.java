package CoreJava;


class Student {
	
	
	int rollNo;
	String name;
	int mark;
	

}
public class ObjArray {
	
	
	public static void main(String a[] ) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		s1.rollNo=1;
		s1.mark=88;
		s1.name= "Amit";
		
		Student s2= new Student();
		s2.rollNo=2;
		s2.mark=99;
		s2.name= "John";
		
		Student s3= new Student();
		s3.rollNo=3;
		s3.mark=77;
		s3.name= "Kingo";
		
		Student student[]= new Student[3];
				student[0]=s1;
				student[1]=s2;
				student[2]=s3;

		//using for loop
				
		for(int i=0; i<student.length; i++) {
		System.out.println(student[i].name + " marks: " + student[i].mark);
		}
		
		// by using enhanced for loop  for each loop
		
		for(Student stud : student)
		{
			System.out.println("\n" + stud.name + " : " + stud.mark);
		}
		
	}

}
