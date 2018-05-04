package objectAndConstructors;

public class Car {

	String model;
	int price;
	static int wheels;

	public Car(String model,int price)//constructor overloading
	{
		this.model=model; //this is a keyword in java always point to the current object
		this.price=price;
	}
	public Car()
	{
		System.out.println("in car constructor zero arguements");
	}
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.model = "BMW";
		c1.price = 24367;
		c1.start();
		c1.acc();
		
		Car c2=new Car();
		c2.model="Maruthi";
		c2.price=10000;
		c2.start();
		c2.acc();

	}

	public void start() {
		System.out.println("start...");
	}

	public void acc() {
		System.out.println("accc...");
	}
}
