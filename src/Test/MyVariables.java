package Test;

public class MyVariables {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.wheels=4;
		obj.seater=4;
		Car.Manufacturer="BMW";
		Car obj1=new Car();
		obj1.wheels=5;
		obj1.seater=5;
		System.out.println(obj.wheels);
		System.out.println(obj.seater);
		System.out.println(Car.Manufacturer);
		System.out.println(obj1.wheels);
		System.out.println(obj1.seater);
		System.out.println(Car.Manufacturer);
		
	}
}
class Car
{
	static String Manufacturer;
	int wheels;
	int seater;

}