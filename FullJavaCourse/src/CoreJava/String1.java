package CoreJava;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Hi");
		
		sb.append(" Your append");
		sb.toString();							// convert StringBuffer to string
		
		
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());


		

	}

}
