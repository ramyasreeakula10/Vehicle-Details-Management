package constructor;

public class ConstructorScenario2 {
	String brand;
	String model;
	String imei;
	int price;
	public ConstructorScenario2(String brand,String model,String imei,int price) {
		this.brand=brand;
		this.model=model;
		this.imei=imei;
		this.price=price;
	}
	public void displaydetails() {
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.imei);
		System.out.println(this.price);
	}

	public static void main(String[] args) {
		ConstructorScenario2 c=new ConstructorScenario2("maruthi","fz25","56e5",65000);
		ConstructorScenario2 c1=new ConstructorScenario2("suki","royalnfield","5925",90000);
		c.displaydetails();
		c1.displaydetails();
		
	}

}
