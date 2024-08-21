package AdvanceJava;



enum laptop{
	
	mackbook(50000), Dell(65000) , Asus, Hp(70000) ;

	private int price;			// price is private so generate constructor and getter setter 
	

	private laptop(int price) {
		this.price = price;
	}

	laptop() {
		price=1000;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}

public class EnumClass {

	public static void main(String[] args)
	{		
	
		for(laptop lap : laptop.values())
		System.out.println(lap + ": " + lap.getPrice());
		

	}

}																	
