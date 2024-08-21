package CoreJava;



 class Mobile
 {	
		int price;
		String name;
		String brand;
		
		public void show() {
			System.out.println(" without static\n" + brand +" " + name + " =" +price);
		}
	
		public void Show1(Mobile m) {
			
			
			System.out.println("With ststic \n" +m.brand +" " + m.name + " =" + m.price);
		}
		
	
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile();
		m.price= 100;
		m.name= "11";
		m.brand="iphone";
		
		Mobile m2 = new Mobile();
		m2.price= 200;
		m2.name= "12";
		m2.brand="Samsung";
		
		Mobile mob[] = new Mobile[2];
		
		mob[0]=m2;
		mob[1]=m;
		
		for(int i=0;i<=1;i++)
		{
			System.out.println("Uisng for \n " + mob[i].brand +" " + mob[i].name + " =" +mob[i].price);
		}
		m.show();
		m.Show1(m2);
		

	}

}
