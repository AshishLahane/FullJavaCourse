package AdvanceJava;


interface F{
	
	//void show(int i);
	int add(int i, int j);
}


public class Lambda {

	public static void main(String[] args) {

	//	F fi =  i ,j->System.out.println("I am a Lmabda Exporession" + " "+ i );
		
		F fi= (i,j)-> i+j;

		int result=	fi.add(10,20);
		
		System.out.println(result);
		
	}

}
